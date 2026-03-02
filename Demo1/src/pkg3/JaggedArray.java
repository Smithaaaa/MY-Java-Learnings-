package pkg3;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a[] = {1,2,3,4};
			int b[] = {2,4,8};
			int c[] = {5,6,7,8};
			
			int d[][] = {
					{1,2,3,4},
					{2,4,6},
					{5,6,7,8,9}
							
			};
			
			System.out.println(d[0][1]);
			System.out.println("==============");//Jagged Array
			
			for(int i =0;i<d.length;i++) {
				for(int j =0;j<d[i].length;j++)
				{
					System.out.print(" "+d[i][j]);
				}
				System.out.println();
	}

	}
}  
