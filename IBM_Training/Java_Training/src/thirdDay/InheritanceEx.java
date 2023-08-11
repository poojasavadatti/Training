package thirdDay;



public class InheritanceEx extends Employee {



	

	//private is limited to same class

	//public accessible everywhere

	//Protected in accessible in same package

	//default- accessible from same file

	

	

	public static void main(String[] args) {

		//InheritanceEx sal=new InheritanceEx();

		Employee emp=new Employee();

		System.out.println(emp.balance);

//		System.out.println(emp.salary);

	    emp.job();

		

	}



}



class Employee{

	  private int salary=100000;

	  protected int balance=80000;

	  public int id=123;

	public void job() {

		System.out.println("Analyst");

	}

}



