package clientEntity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2015-05-17T23:21:54")
@StaticMetamodel(Todolist.class)
public class Todolist_ { 

    public static volatile SingularAttribute<Todolist, Integer> id;
    public static volatile SingularAttribute<Todolist, Date> waktu;
    public static volatile SingularAttribute<Todolist, String> tempat;
    public static volatile SingularAttribute<Todolist, Short> status;
    public static volatile SingularAttribute<Todolist, Date> tanggal;
    public static volatile SingularAttribute<Todolist, String> kerjaan;

}