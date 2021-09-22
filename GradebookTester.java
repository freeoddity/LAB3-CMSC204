import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	GradeBook gb1;
	GradeBook gb2;

	@BeforeEach
	void setUp() throws Exception {
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		gb1.addScore(15);
		gb1.addScore(33.3);
		gb1.addScore(97.50);
		gb1.addScore(77.77);
		gb1.addScore(88.88);
		
		gb2.addScore(10);
		gb2.addScore(80);
	}

	@AfterEach
	void tearDown() throws Exception {
		GradeBook gb1 = null;
		GradeBook gb2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(gb1.toString().equals("15.0 33.3 97.5 77.77 88.88"));
		assertEquals(gb1.getScoreSize(), 5, .001);
		assertTrue(gb2.toString().equals("10.0 80.0 "));
		assertEquals(gb2.getScoreSize(), 2, .001);
	}
	@Test
	void testSum()
	{
		assertEquals(gb1.sum(), 312.45, .001);
		assertEquals(gb2.sum(), 90, .001);
	}
	@Test
	void testMinimum()
	{
		assertEquals(gb1.minimum(),15, .001);
		assertEquals(gb2.minimum(), 10, .001);
	}
	@Test
	void testFinalScore()
	{
		assertEquals(gb1.finalScore(), 297.45, .001);
		assertEquals(gb2.finalScore(), 80, .001);
	}
	

}
