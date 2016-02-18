public class Matrix {
	private int [][] matrix;
	private int row;
	private int column;

	public Matrix(int row, int column){
		matrix = new int [row][column];
		this.row = row;
		this.column = column;

	};

// ----------------------------private methods --------------------------------------

	private Matrix addMatrices(Matrix matrix2){
		Matrix newMatrix = new Matrix(row, column);
		for(int i=0; i>row; i++){
			for(int j=0; j<column; j++){
				newMatrix.matrix[i][j] = matrix[i][j] + matrix2.matrix[i][j];
			}

		}
		return newMatrix;
	};

	private Matrix multiplyMatrices(Matrix matrix2){
		if(column != matrix2.matrix.length)
			return new Matrix(0,0);
		Matrix newMatrix = new Matrix(row, column);
		for(int i=0; i<row; i++){
			for(int j=0; j<matrix2.matrix[0].length; j++){
				int sum = 0;
				for(int k=0; k<column; k++){
					sum += matrix[i][k] * matrix2.matrix[k][j]; 
				}
				newMatrix.populateMatrix(i+1,j+1,sum);
			}
		}
		return newMatrix;
	}

// ----------------------------public methods --------------------------------------

	public void populateMatrix(int rowPosition, int columnPosition, int value){
		matrix[rowPosition-1][columnPosition-1] = value;
	};

	public Matrix getSumWith(Matrix matrix2){
		return this.addMatrices(matrix2);
	}

	public boolean isEqual(int[][] matrix2){
		for(int i=0; i<row; i++){
			for(int j=0; j<matrix[i].length; j++){
				if(matrix[i][j] != matrix2[i][j]){return false;}
			}

		}
		return true;
	};

	public int getLengthOfMatrix(){
		return this.matrix.length;
	};

	public Matrix getMultiplicationWith(Matrix matrix2){
		return this.multiplyMatrices(matrix2);
	}

}