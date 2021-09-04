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
		
		Actor a=new Actor();
		a.setAid(20);
		a.setAname("Salman");
		
		Movies m=new Movies();
		m.setMid(30);
		m.setMname("tubelight");
		m.setAc(a);
		
		Movies m1=new Movies();
		m1.setMid(40);
		m1.setMname("bhijaan");
		m1.setAc(a);
		
		session.save(m);
		session.save(m1);
		session.save(a);

		
		txn.commit();
		session.close();
		
		

	}

}
