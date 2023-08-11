package unitTests;



import static org.junit.Assert.assertEquals;



import org.junit.jupiter.api.Test;



import fifthDay.MathOperations;



class TestMathOperations {



	@SuppressWarnings("deprecation")

	MathOperations operations=new MathOperations();

	@Test

	public void testAddFunction() {

		int result=operations.add(30,10);

		//instead of below code

		/*

		if(result==40) {

			System.out.println("Pass");

		}

		else {

			System.out.println("fail");

		}

		*/

		assertEquals(40,result);

		

		assertEquals(40,operations.add(10,30));

		assertEquals(10,operations.add(10,0));

		assertEquals(-40,operations.add(-10, -30));

	}

		@Test

		public void testDevideFunction() {

		assertEquals(0,operations.devide(5,0));

		assertEquals(1,operations.devide(2,2));

		assertEquals(4,operations.devide(8,2));

		

		}

		

	}





