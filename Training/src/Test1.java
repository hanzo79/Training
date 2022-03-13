import java.io.IOException;

public class Test1 {

	static int numberEggs=0;
	
	public static void main(String[] args) throws IOException {
		
		//int[] array = new int[3];
		//array[0]=1;
		//System.out.println(array.toString());
		//fall(11);
		try {
		setNumberEggs(-1);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.print("Hello");
		
		givenNum("****");

	}
	
	static void fall(int distance) throws IOException {
		if (distance > 10) {
			throw new IOException();
			
		}
	}
	
	public static void setNumberEggs(int numberEgg) {
		if(numberEgg < 0) {
			throw new IllegalArgumentException("Should not be Negative");
		}
		numberEggs= numberEgg;
		
	}
	
	public static String givenNum(String a) throws NumberFormatException {
		return String.valueOf(a);
	}

}
