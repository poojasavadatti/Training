package secondDay;



public class StringManipulation {



	public static void main(String[] args) {

		// TODO Auto-generated method stub



		String student1="Rakesh";

		String student2="Ramesh";

		String student3="Raksha";

		System.out.println(student1.toLowerCase());

		System.out.println(student2.toUpperCase());

		System.out.println(student1.contains("k"));

		System.out.println(student3.charAt(4));

		System.out.println(student2.indexOf("s"));

		System.out.println(student2.length());

		System.out.println(student1.endsWith("h"));

		System.out.println(student2.substring(3));

		System.out.println(student2.substring(3,5));

		System.out.println(student3.replace("k", "new"));

		System.out.println(student1.compareTo(student2));

		for(int i=0;i<student1.length();i++) {

			System.out.println(student1.charAt(i));

		}

		String students[]= {"Harish","Joshna","Monica","Vivan"};

		//fixed size problem

		//Always insertion will be at end

		//index based fetching results slow in performance

		//Memory wastage if memory is more

		//sorting , searching are complex

		

	}



}

