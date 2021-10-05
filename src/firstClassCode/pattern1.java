package firstClassCode;

public class pattern1 {

	public static void main(String[] args) {
		int num=10;

		for(int j=1; j<= num;j++) {

			for (int i=num-j;i>0;i--) {
				System.out.print("-");
			}
			
			for (int y=1;y<j+1;y++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
