import java.util.*;
public class Matrix_Main {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		int r1,c1,r2,c2;
	
		System.out.print("Enter of row 1:");
		r1 = x.nextInt();
		System.out.print("Enter of Column 1 :");
		c1 = x.nextInt();
		
		System.out.print("Enter of row 2 :");
		r2 = x.nextInt();
		System.out.print("Enter of Column 2 :");
		c2 = x.nextInt();
		
		int[][] mat1 = new int[r1][c1];
		int[][] mat2 = new int[r1][c2];
		
		System.out.print("Enter the Max :");
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				mat1[i][j] = x.nextInt();
			}
		}
		
		
		System.out.print("Enter the Max :");
		
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				mat2[i][j] = x.nextInt();
			}
		}
		
		Matrix o1 = new Matrix(r1,c1,r2,c2,mat1,mat2);
		o1.add();
	//	o1.sub();
	//	o1.multiply();
	//	o1.trans();
		
		
		
	}
	
}


