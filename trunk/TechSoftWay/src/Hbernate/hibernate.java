package Hbernate;



import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.cfg.Configuration;
public class hibernate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SchemaExport se = new SchemaExport (cfg);
		se.create(true,true);
		

	}

}
