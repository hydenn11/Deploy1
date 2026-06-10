public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());

		counter.setCount(10);
		System.out.println("Current count:" + counter.getCount());
	}

}
