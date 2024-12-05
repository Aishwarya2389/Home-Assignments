package week3assignments;



public abstract class DatabaseMethods implements DatabaseConnection  {
	@Override
	public void disconnect() {
		System.out.println("connection lost");
		
	}
	@Override
	public void executeUpdate() {
		System.out.println("updated successfully");
	}
	public void connect(){
		System.out.println("connection have to be done properly");
	}

}