package secondDay;



public class EvenOddArray {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

    int array[]=new int[6];

    int num[]= {10,45,2,67,7,3};

   

    for(int arr=0;arr<num.length;arr++) {

    	if(arr%2==0)	{

    		System.out.println("Even numbers");

    		System.out.println(num[arr]);

    	}

    	else if(arr%2!=0) {

    		System.out.println("odd numbers");

    		System.out.println(num[arr]);

    	}

    }

    

	}



}

