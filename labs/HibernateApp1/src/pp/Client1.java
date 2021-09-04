package pp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Client1 {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();//it is used to load configuration file
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        
        Transaction txn=s.beginTransaction();
        
        //delete from transient
        //Dept d=new Dept();//Transient
        //d.setDeptId(20);//Transient
        //s.delete(d);//Persistent
        
        //delete from Persistent
       // Dept d1=s.get(Dept.class,new Integer(30));
        //s.delete(d1);
        
        //Delete from Detached state
        
        Dept d1=s.get(Dept.class,new Integer(40));//Persistent
        s.evict(d1);//Detached
        s.delete(d1);
                

        
        txn.commit();
        s.close();
        
        
	}

}
