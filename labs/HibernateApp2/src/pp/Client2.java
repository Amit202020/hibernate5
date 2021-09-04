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

public class Client2 {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction txn=s.beginTransaction();
		
		//call named query
		/*Query q=s.getNamedQuery("Product.byProdId");
        q.setInteger(0,110);
        List lst=q.list();
        System.out.println(lst);*/
		
		
		//call native sql
		/*Query q=s.getNamedQuery("Product.byProductName");
		q.setString(0,"laptop");
		List el=q.list();
		System.out.println(el);*/
		
		//criteria
		/* Criteria  criteria = s.createCriteria(Product.class);
         List<Product> lst=(List<Product>)criteria.list();
         for(Product p: lst){
                  System.out.println(p.getProdId()+"/"+p.getProdName()+"/"+p.getProdDesc());
          }*/
		
		//using Restrictions

       /* Criteria  criteria = s.createCriteria(Product.class);
        Criterion  criterion= Restrictions.eq("prodId",60);
        criteria.add(criterion);
        Product p=(Product)criteria.uniqueResult();
        System.out.println(p);*/
        
        //using Projection
        
		 /*Criteria  criteria = s.createCriteria(Product.class);
         Projection  projection= Projections.property("prodDesc");
         criteria.setProjection(projection);
         List lst=criteria.list();
         System.out.println(lst);*/
        

         
		
		txn.commit();
		
		s.close();
		
		
		

	}

}
