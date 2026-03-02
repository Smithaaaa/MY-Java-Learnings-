package pkg3;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4};
		int b[] = {2,4,6,8};
		int c[] = {5,6,7,8};
		
		int d[][] = {
				{1,2,3,4},
				{2,4,6,8},
				{5,6,7,8}
						
		};
		
		System.out.println(d[0][1]);
		System.out.println("==============");//2D Array
		
		for(int i =0;i<3;i++) {
			for(int j =0;j<4;j++)
			{
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
	}

}
