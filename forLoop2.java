package forLoop;

public class forLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i = i + 2) {
			
				for(int j = 0; j < i; j++) {
					
					System.out.println("*");
					
					if(j<i) {
						
						System.out.print("*");
						
					}
				
			}
		}

	}

}
