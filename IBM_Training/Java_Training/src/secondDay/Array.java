package secondDay;



public class Array {



	public static void main(String[] args) {

		// TODO Auto-generated method stub



		int roll_no[]=new int[10];

		int student_roll[]= {3,6,4,1,2,9,5,4,8,2};

		

		//if size is n

		//last element will be --> n-1th

//		System.out.println(myArray[0]);

//		

//		for(int num=0;num<=9;num++) {

//			System.out.println(num);

//		}

//		for(int i=0;i<student_roll.length;i++) {

//			System.out.println(student_roll[i]);

//		}

//		//while loop

//		int i=0;

//		while(i<student_roll.length) {

//			System.out.println("while loop");

//			System.out.println(student_roll[i]);

//			i++;

//		}

//		//do while

//		int a =1;

//		do {

//			a++;

//			System.out.println(a);

//		}while(a<=20);

//		//for each loop

		for(int array:student_roll){

			System.out.println(array);

			

		}

	}



}

