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
		
		Employee e=new Employee();
		e.setEmpId(100);
		e.setEmpName("srini");
		
		Address a=new Address();
		a.setLineNo(20);
		a.setCity("Bangalore");
		
		e.setAddr(a);
		
		//session.save(a);
		session.save(e);
		
		txn.commit();
		session.close();

	}

}
