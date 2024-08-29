public class Matrix {

	int r1,r2,c1,c2,sum = 0;
	int[][] m1;
	int[][] m2;
	int[][] resultmatrix = new int[r1][c1];
    int[][] resultmatrix2 = new int[r1][c2];
	
	Matrix(int r1,int r2,int c1,int c2, int[][] m1,int[][] m2) {
		this.m1 = m1;
		this.m2 = m2;
		this.c1 = c1;
		this.c2 = c2;
		this.m1 = m1;
		this.m2 = m2;
	}
	
	Matrix(int row1, int col1, int[][] mat1){
		this.r1 =  row1;
		this.c1 = col1;
		this.m1 = mat1;
	}
	
	public void add() {
		if(r1!=r2 && c1!= c2) {
			System.out.print("Invalid");
		}else {
			for(int i = 0;i < r1;i++) {
				for(int j =0; j<c1; j++) {
					resultmatrix[i][j] = m1[i][j]+ m2[i][j];
				}
			}
		}
		print();		
	}
	
	public void sub() {
		if(r1!=r2 && c1!= c2) {
			System.out.print("Invalid");
		}else {
			for(int i = 0;i < r1;i++) {
				for(int j =0; j<c1; j++) {
					resultmatrix[i][j] = m1[i][j]- m2[i][j];
				}
			}
		}
		print();		
	}
	
	public void multiply() {
		sum = 0;
		
		for(int i = 0; i< r1;i++) {
			for(int j = 0; j<c2; j++) {
				for(int k =0; k<r1;k++) {
					sum = sum + m1[i][k] * m2[k][i];				
				}
				resultmatrix2[i][j] = sum;
				sum = 0;					
			}
		}
		
		System.out.print("Result :");
		for(int i = 0; i<r1;i++) {
			for(int j = 0; j<c1;j++) {
				System.out.println(resultmatrix[i][j]);
			}
		}
	}
	
	public void trans() {
		if(r1!=r2 && c1!= c2) {
			System.out.print("Invalid");
		}else {
			for(int i = 0;i < r1;i++) {
				for(int j =0; j<c1; j++) {
					resultmatrix[i][j] = m1[j][i];
				}
			}
		}
		print();		
	}
	
	
	public void print() {
		System.out.println("Matrix 01:");
		for(int i = 0;i<r1;i++) {
			for(int j = 0; j<c1;j++) {
				System.out.print(m1[i][j] + "   ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix 02:");
		for(int i = 0;i<r2;i++) {
			for(int j = 0; j<c2;j++) {
				System.out.print(m2[i][j] + "   ");
			}
			System.out.println();
		}
		
		System.out.println("Result:");
		for(int i = 0;i<r1;i++) {
			for(int j = 0; j<c1;j++) {
				System.out.print(resultmatrix[i][j] + "   ");
			}
			System.out.println();
		}
		
	}
	
}
