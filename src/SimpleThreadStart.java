
public class SimpleThreadStart {

	public static void main(String[] args) {
	
//----------------------------------------Before Java-------------------------------------------------------------------//
		
		
		Runnable t1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread-1");
				
			}
		};
		new Thread(t1).start();
		
//---------------------------------------------------In java 8------------------------------------------------------------//
		
		Runnable t2 = () -> System.out.println("Thread-2");
		new Thread(t2).start();
	
		
//-----------------------------------------------Before Java-----------------------------------------------------------------//
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread-3");
				
			}
		}).start();
		
//----------------------------------------------------In java8--------------------------------------------------------------//
		
		new Thread(() -> 
		{
			System.out.println("Thread-4");
			System.out.println("Thread-5");
		}) .start();

	}

}
