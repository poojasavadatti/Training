package thirdDay;



import java.util.HashSet;

import java.util.Iterator;







public class HashSetEx {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

        //insertion order is not maintained

		//removed duplicates

		HashSet<String> fruits=new HashSet<String>();

		fruits.add("Avacado");

		fruits.add("Blueberry");

		fruits.add("Kiwi");

		fruits.add("Avacado");

		System.out.println(fruits);



		HashSet<Integer> integer=new HashSet<Integer>();

		integer.add(10);

		integer.add(56);

		integer.add(30);

		integer.add(70);

		System.out.println(integer);

	Iterator<Integer>itr=integer.iterator();

	while(itr.hasNext()) {

		System.out.println(itr.next());

	}

	

		

		

	}



}

