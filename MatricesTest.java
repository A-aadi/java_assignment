import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;

public class MatricesTest{
	Matrix matrix1;
	Matrix matrix2;
	@Before
	public void populateMatrix(){
		matrix1 = new Matrix(2,2);
		matrix1.populateMatrix(1,1,3);
		matrix1.populateMatrix(1,2,1);
		matrix1.populateMatrix(2,1,5);
		matrix1.populateMatrix(2,2,6);

		matrix2 = new Matrix(2,2);
		matrix2.populateMatrix(1,1,6);
		matrix2.populateMatrix(1,2,5);
		matrix2.populateMatrix(2,1,9);
		matrix2.populateMatrix(2,2,4);
	}
	@Test
	public void test_for_populateMatrix(){
		int[][] expectedMatrix = {{3,1},{5,6}};
		assertEquals(matrix1.getLengthOfMatrix(), 2);
		assertTrue(matrix1.isEqual(expectedMatrix));
	}
	@Test
	public void test_for_addMatrices(){
		Matrix matrix = matrix1.getSumWith(matrix2);
		assertEquals(matrix.getLengthOfMatrix(),2); 
		int[][] expectedMatrix = {{9,6},{14,10}};
	}
}