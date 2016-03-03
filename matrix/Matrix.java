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
	};

	private int getDeterminant(){
		int det = 0, sign = 1, p = 0, q = 0;
		int matrix_size = this.matrix.length;
		if(matrix_size==1)
			det = this.matrix[0][0];
		else{
			Matrix new_matrix = new Matrix(matrix_size-1, matrix_size-1);
			for(int x = 0; x < matrix_size ; x++){
				p=0;q=0;
				for(int i = 1;i < matrix_size; i++){
					for(int j = 0; j < matrix_size; j++){
						if(j != x){
							new_matrix.matrix[p][q++] = this.matrix[i][j];
							if(q % (matrix_size-1) == 0){
								p++;
								q=0;
							};
						};
					};
				};
				det = det + this.matrix[0][x] * new_matrix.getDeterminant() * sign;
				sign = -sign;
		};
	};
	return det;
	};

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
	};

	public int getDeterminantOf(){
		return this.getDeterminant();
	}

}