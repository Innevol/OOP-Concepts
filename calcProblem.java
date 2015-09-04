package polyProgram;

public class calcProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calcProblem obj1 = new calcProblem();
		
		obj1.calc(0.4, 5);
		
	}

	void calc(int x, int y) {

		int value = x + y;
		
		System.out.println(value);

	}

	void calc(double x, double y) {
		
double value = y - x;
		
		System.out.println(value);

	}

	void calc(float x, float y) {

float value = x / y;
		
		System.out.println(value);

	}
	
	void calc(int x, double y) {

double value = x * y;
		
		System.out.println(value);

	}

}
