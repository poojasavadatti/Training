package fifthDay;



public class MathOperations {



	public int add(int a, int b) {

		return a+b;

	}

	public int sub(int a, int b) {

		return a-b;

	}

	public int multiply(int a, int b) {

		return a*b;

	}

	public int devide(int a, int b) {

		if(b==0) {

			return 0;

		}

		return a/b;

	}

	public int reminder(int a, int b) {

		return a%b;

	}

}

