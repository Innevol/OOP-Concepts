package exceptionProgram;

public class arrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			int arr[] = new int[5];
			
			System.out.println("The array: " + arr[7]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Error Thrown: " + e);
			
		} finally {
			
			System.out.println("This is the end");
			
		}

	}

}