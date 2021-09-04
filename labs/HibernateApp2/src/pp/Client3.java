package pp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class Client3 {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		//first user
		Session s=sf.openSession();
		Transaction txn=s.beginTransaction();
		Product p=s.get(Product.class,new Integer(80));
		System.out.println(p);
		Product p1=s.get(Product.class,new Integer(80));
		System.out.println(p1);
		Product p2=s.get(Product.class,new Integer(80));
		System.out.println(p2);
		txn.commit();
		s.close();
		
		//2nd user
		Session s1=sf.openSession();
		Transaction txn1=s1.beginTransaction();
		
		Product p3=s1.get(Product.class,new Integer(90));
		System.out.println(p3);
		Product p4=s1.get(Product.class,new Integer(90));
		System.out.println(p4);
		Product p5=s1.get(Product.class,new Integer(90));
		System.out.println(p5);
		
		txn1.commit();
		s1.close();
		

	}

}
