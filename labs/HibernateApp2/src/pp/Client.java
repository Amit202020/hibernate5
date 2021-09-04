package pp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction txn=s.beginTransaction();
		
		Product p=new Product();
		p.setProdId(90);
		p.setProdName("bag");
		p.setProdDesc("Total 10");
		
		Product p1=new Product();
		p1.setProdId(100);
		p1.setProdName("chair");
		p1.setProdDesc("Total 30");
		
		
		
		Product p2=new Product();
		p2.setProdId(110);
		p2.setProdName("board");
		p2.setProdDesc("Total 100");
		
		s.save(p);
		s.save(p1);
		s.save(p2);
		
		txn.commit();
		
		s.close();
		
		
		

	}

}
