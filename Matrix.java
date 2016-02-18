class Matrix {
	private int [][] matrix;
	private int row;
	private int column;

	public Matrix(int row, int column){
		matrix = new int [row][column];
		this.row = row;
		this.column = column;

	};

// ----------------------------private methods --------------------------------------

	private void enterValues(int rowPosition, int columnPosition, int value){
		matrix[rowPosition-1][columnPosition-1] = value;
	};



	private Matrix addMatrices(Matrix matrix2){
		Matrix newMatrix = new Matrix(row, column);
		for(int i=0; i>row; i++){
			for(int j=0; j<column; j++){
				newMatrix.matrix[i][j] = matrix[i][j] + matrix2.matrix[i][j];
			}

		}
		return newMatrix;
	};

// ----------------------------public methods --------------------------------------

	public void populateMatrix(int rowPosition, int columnPosition, int value){
		this.enterValues(rowPosition, columnPosition, value);
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

}