package pp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Client {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();//it is used to load configuration file
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        
        Transaction txn=s.beginTransaction();
        
        Dept d=new Dept();
        d.setDeptId(20);
        d.setDeptName("Srinibus");
        d.setDeptDesc("Hyd");
        s.save(d);
        
        //get
        /*Dept d=(Dept)s.get(Dept.class,new Integer(50));
        System.out.println(d);*/
       
        //load
        /*Dept d=(Dept)s.load(Dept.class,new Integer(80));
        System.out.println(d);*/
        
        //HQL
        /*Query q=s.createQuery("from Dept");
        List ls=q.list();
        Iterator it=ls.iterator();
        while(it.hasNext()){
             Dept d=(Dept)it.next();
             System.out.println(d.getDeptId()+"/"+d.getDeptName()+"/"+d.getDeptDesc());
        }*/
        
        //HQL
       /* Query q=s.createQuery("from Dept");
        Iterator it=q.iterate();
        while(it.hasNext()){
             Dept d=(Dept)it.next();
             System.out.println(d.getDeptId()+"/"+d.getDeptName()+"/"+d.getDeptDesc());
        }*/
        

        
        txn.commit();
        s.close();
        
        
	}

}
