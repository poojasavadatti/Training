package unitTests;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class PreHookstest {

//do we write all code in same file=how will have junits across different file

	//junit test suite

	//junit with maven

	

	@BeforeAll

	static void setUpBeforeClass() throws Exception {

		System.out.println("Before class");

	}



	@AfterAll

	static void tearDownAfterClass() throws Exception {

		System.out.println("After class");

	}



	@BeforeEach

	void setUp() throws Exception {

		System.out.println("Before");

	}



	@AfterEach

	void tearDown() throws Exception {

		System.out.println("After");

	}



	@Test

	

	void test1() {

		System.out.println("test1");

	}





	@Test

	

	void test2() {

		System.out.println("test2");

	}

}

