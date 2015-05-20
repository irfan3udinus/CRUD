/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entityClient;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * 
 */
@Entity
@Table(name = "TODOLIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Todolist.findAll", query = "SELECT t FROM Todolist t"),
    @NamedQuery(name = "Todolist.findById", query = "SELECT t FROM Todolist t WHERE t.id = :id"),
    @NamedQuery(name = "Todolist.findByTanggal", query = "SELECT t FROM Todolist t WHERE t.tanggal = :tanggal"),
    @NamedQuery(name = "Todolist.findByWaktu", query = "SELECT t FROM Todolist t WHERE t.waktu = :waktu"),
    @NamedQuery(name = "Todolist.findByTempat", query = "SELECT t FROM Todolist t WHERE t.tempat = :tempat"),
    @NamedQuery(name = "Todolist.findByKerjaan", query = "SELECT t FROM Todolist t WHERE t.kerjaan = :kerjaan"),
    @NamedQuery(name = "Todolist.findByStatus", query = "SELECT t FROM Todolist t WHERE t.status = :status")})
public class Todolist implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TANGGAL")
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @Column(name = "WAKTU")
    @Temporal(TemporalType.TIME)
    private Date waktu;
    @Size(max = 20)
    @Column(name = "TEMPAT")
    private String tempat;
    @Size(max = 100)
    @Column(name = "KERJAAN")
    private String kerjaan;
    @Column(name = "STATUS")
    private Short status;

    public Todolist() {
    }

    public Todolist(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Date getWaktu() {
        return waktu;
    }

    public void setWaktu(Date waktu) {
        this.waktu = waktu;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public String getKerjaan() {
        return kerjaan;
    }

    public void setKerjaan(String kerjaan) {
        this.kerjaan = kerjaan;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Todolist)) {
            return false;
        }
        Todolist other = (Todolist) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entityClient.Todolist[ id=" + id + " ]";
    }
    
}
