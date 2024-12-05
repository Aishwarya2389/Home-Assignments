package week3assignments;

public class JavaConnection extends DatabaseMethods{

	public static void main(String[] args) {
		JavaConnection Jc = new JavaConnection();
		Jc.connect();
		Jc.disconnect();
		Jc.executeUpdate();
	}

}
