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
		int[][] expectedMatrix = {{6,5},{9,4}};
		assertEquals(matrix2.getLengthOfMatrix(), 2);
		assertTrue(matrix2.isEqual(expectedMatrix));
	}

	@Test
	public void test_for_addMatrices(){
		Matrix matrix = matrix1.getSumWith(matrix2);
		assertEquals(matrix.getLengthOfMatrix(),2); 
		int[][] expectedMatrix = {{9,6},{14,10}};
	}
	@Test
	public void test_for_multiplyMatrices_for_square_matrix(){
		int[][] expectedMatrix = {{27,19},{84,49}};
		Matrix matrix = matrix1.getMultiplicationWith(matrix2);
		assertEquals(matrix.getLengthOfMatrix(), 2);
		assertTrue(matrix.isEqual(expectedMatrix));
	}

	@Test
	public void test_for_multiplyMatrices_for_m_by_n_matrix(){
		int[][] expectedMatrix = {{27,19},{84,49},{24,13}};

		Matrix matrix3 = new Matrix(3,2);
		matrix3.populateMatrix(1,1,3);
		matrix3.populateMatrix(1,2,1);
		matrix3.populateMatrix(2,1,5);
		matrix3.populateMatrix(2,2,6);
		matrix3.populateMatrix(3,1,1);
		matrix3.populateMatrix(3,2,2);

		Matrix matrix = matrix3.getMultiplicationWith(matrix2);
		assertEquals(matrix.getLengthOfMatrix(), 3);
		assertTrue(matrix.isEqual(expectedMatrix));
	}

	@Test
	public void multiplyMatrices_should_return_null_if_mulyiplication_is_not_possible(){
		int[][] expectedMatrix = {};
		Matrix matrix3 = new Matrix(3,2);
		matrix3.populateMatrix(1,1,3);
		matrix3.populateMatrix(1,2,1);
		matrix3.populateMatrix(2,1,5);
		matrix3.populateMatrix(2,2,6);
		matrix3.populateMatrix(3,1,1);
		matrix3.populateMatrix(3,2,2);
		Matrix matrix = matrix1.getMultiplicationWith(matrix3);
		assertEquals(matrix.getLengthOfMatrix(), 0);
		assertTrue(matrix.isEqual(expectedMatrix));
	}
}