package githubExercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numx3test {

	@Test
	void test() {
		//creates object
		GitExercise test = new GitExercise();
		
		//creates output of the numX2 method
		int numx3Output = test.NumX3(5);
		
		//tests to see if equal 
		assertEquals(125,numx3Output);
	}

}
