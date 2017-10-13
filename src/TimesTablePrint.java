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
		for(int low1=low;low1<high;low1++) {
			System.out.println("\n"+low1);

		}
		while (low<=high) {


			System.out.print("\t"+low);

			low+=1;
			}
			

		}

	}
