package githubExercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numx2test {

	@Test
	void test() {
		//creates object
		GitExercise test = new GitExercise();
		
		//creates output of the numX2 method
		int numx2Output = test.NumX2(5);
		
		//tests to see if equal 
		assertEquals(25,numx2Output);
	}

}
