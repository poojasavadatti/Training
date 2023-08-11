package secondDay;



public class ReverseStringWithoutMethod {



	public static void main(String[] args) {

		// TODO Auto-generated method stub



		String str="Bangalore";

		System.out.println("Original String : "+str);

		System.out.print("After reverse String : ");

		for(int i=str.length();i>0;--i) {

			

			System.out.print(str.charAt(i-1));

			

		}

		

	}



}

