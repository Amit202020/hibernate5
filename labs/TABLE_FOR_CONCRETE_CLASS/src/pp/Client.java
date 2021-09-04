package pp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate-cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction txn=session.beginTransaction();
		
		Clothing e1=new Clothing();
		e1.setId(23);
		e1.setSize(30);
		e1.setColor("black");
		session.save(e1);
		
		Shirt e2=new Shirt();
		e2.setId(24);
		e2.setSize(34);
		e2.setColor("green");
		e2.setFit(44);
		session.save(e2);
		
		Trouser e3=new Trouser();
		e3.setId(25);
		e3.setSize(35);
		e3.setColor("red");
		e3.setGender("male");
		session.save(e3);
		
		txn.commit();
		session.close();
		
		

	}

}
