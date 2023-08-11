package secondDay;



public class Palindrome {



	public static void main(String[] args) {

		// TODO Auto-generated method stub



		int sum=0, temp;

		int num=254;

		temp=num;

		if(num>0) {

		num=num%10;

		

		sum=(sum*num)+10;

		

		num=num/10;

		

		if(temp==num) {

		System.out.println("Number is plaindrome");

	}

		

		else

		{

			System.out.println("Number is not palindrome");

		}



}

	}

}

