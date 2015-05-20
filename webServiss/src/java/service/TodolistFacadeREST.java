/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.entityClient.Todolist;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;

/**
 *
 * 
 */
@Stateless
@Path("com.entityclient.todolist")
public class TodolistFacadeREST extends AbstractFacade<Todolist> {
    @PersistenceContext(unitName = "webServissPU")
    private EntityManager em;

    public TodolistFacadeREST() {
        super(Todolist.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Todolist entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(Todolist entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Todolist find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Todolist> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Todolist> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @java.lang.Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
