import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] input2 = {1, 2, 3, 4};
    int[] input2reversed = {4, 3, 2, 1};
    assertArrayEquals(input2reversed, ArrayExamples.reversed(input2));

  }

  @Test
  public void testAverageWithoutLowest() {
    double[] testerArray = {1, 2, 3, 4};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(testerArray), 0.001);

    double[] testerArray2 = {1,1,1,1};
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(testerArray2), 0.001);
  
    double[] testerArray3 = {3,2,1,2,3};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(testerArray3), 0.001);
  
  }
}
