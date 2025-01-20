package week3assignments;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public interface DatabaseConnection {

public void connect(); 
	public void disconnect();
	public void executeUpdate();
}
