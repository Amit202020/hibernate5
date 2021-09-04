package pp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Client2 {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();//it is used to load configuration file
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
       // Session s=sf.openSession();
        
      //  Transaction txn=s.beginTransaction();
        
        //update from same session for Persistent state
        /*Dept d=s.get(Dept.class,new Integer(20));
        d.setDeptDesc("Del");
        s.update(d);*/
        

        // update in same session from Detached
       /* Dept d=s.get(Dept.class,new Integer(30));//Persistent
        s.evict(d);//Detached
        d.setDeptName("Navin");
        s.update(d);*/
                
        
        // update detached object from diff session
        
        //user1
        Session s=sf.openSession();
        Transaction txn=s.beginTransaction();

        Dept d=s.get(Dept.class,new Integer(40));
        s.evict(d);

        txn.commit();
        s.close();

        //user2
        Session s1=sf.openSession();
        Transaction txn1=s1.beginTransaction();
          
        d.setDeptName("Sales");
        s1.update(d);

        txn1.commit();
        s1.close();
        
        
	}

}
