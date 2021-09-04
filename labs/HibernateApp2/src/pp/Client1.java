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
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction txn=s.beginTransaction();
		
		
		//select all
		/* Query q= s.createQuery("from Product");
         List lst=q.list();
         System.out.println(lst);*/
         
        //select using condition
        /* Query q= s.createQuery("from Product where prodId > :pid");
         q.setParameter("pid",60);
         List lst=q.list();
         System.out.println(lst);*/
         
         //update using hql
         /*Query q=s.createQuery("update Product set prodDesc= :pdc where prodId= :pid");
         q.setParameter("pdc","Total20");
         q.setParameter("pid", 60);
         q.executeUpdate();*/
         
         //delete
        /* Query q= s.createQuery("delete from Product where prodId= :pid");
         q.setParameter("pid",70);
         q.executeUpdate();*/
		
		//insert
		
		/*Query q=s.createQuery("insert into ProductBackup(prodId,prodName,prodDesc) "
				+ "select prodId,prodName,prodDesc from Product");
        q.executeUpdate();*/
		
		//Pagination
		
		Query q=s.createQuery("from Product");
		q.setFirstResult(2);//position
		q.setMaxResults(2);//max rec
		//List lst=q
		Iterator it=q.iterate();
		while(it.hasNext()){
			Product p=(Product)it.next();
			System.out.println(p.getProdId()+"/"+p.getProdName()+"/"+p.getProdDesc());
		}




		
		
		
		txn.commit();
		
		s.close();
		
		
		

	}

}
