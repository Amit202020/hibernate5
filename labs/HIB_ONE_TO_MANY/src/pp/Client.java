package pp;

import java.util.ArrayList;
import java.util.List;

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
		
		Album a=new Album();
		a.setAid(20);
		a.setAname("nature");
		
		Photo p1=new Photo();
		p1.setPid(33);
		p1.setPname("tree");
		session.save(p1);
		
		Photo p2=new Photo();
		p2.setPid(34);
		p2.setPname("ball");
		session.save(p2);
		
		List<Photo> po=new ArrayList<Photo>();
		po.add(p1);
		po.add(p2);
		
		
		a.setPhotoes(po);
        session.save(a);
		
		txn.commit();
		session.close();
		

	}

}
