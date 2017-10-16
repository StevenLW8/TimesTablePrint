import java.util.Scanner;
import java.util.Random;
public class TimesTablePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in	= new Scanner(System.in);
		//Variables
		int high;
		int low;
		int num=0;
		//Ask the user for input
		System.out.println("What is the biggest number that you want?");
		high=in.nextInt();
		System.out.println("What is the smallest number that you want?");
		low=in.nextInt();
		//Print the times table
		num=low;
		
		int b=low;
	
		for (int x=low;x<=high;x++) {


			System.out.print("\t"+x);

		}
	
		for (int y=low;y<=high;y++)  {
			System.out.println();

			System.out.print(y);

		
			for (int a=low;a<=high;a++) {
				System.out.print("\t"+a*y);
		
			}
			
		}


	}

}
