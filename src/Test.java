import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Test
{

	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure("product.cfg.xml");
		
		 
		  
		   SessionFactory sf = cfg.buildSessionFactory(); 
		   Session session = sf.openSession();  
		   Transaction t = session.beginTransaction();   
		   
		   
		   Product p1=new Product();
		   p1.setPid(102);
		   p1.setPname("mobile");
		   p1.setPcost(30000);
		   session.save(p1);  
		    t.commit();  
		    System.out.println("successfully saved");    
		    sf.close();  
		    session.close();    
		        
		

	}

	
	

	

}
