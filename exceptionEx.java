package exceptionProgram;

public class exceptionEx {
	
	class inputError extends Exception {
		public inputError() {
			
			
			
		}
		
		public inputError(String x) {
			super(x);
			
		}
		
	}
	
	class example {	
		void method() throws inputError {
			throw new inputError("Wrong Input");
			
		}
		
	}

	public static void main(String[] args) throws inputError {
		// TODO Auto-generated method stub
		
		

	}

}
