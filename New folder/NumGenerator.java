package cmps390;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class NumGenerator{
	public static ArrayList<Integer> array = new ArrayList<Integer>();
	static final double PI =180;
	
	public static void main(String[] args) {
		System.out.println("What number do you want the number to be increased by");
		Scanner input  =new Scanner(System.in);
		int number=input.nextInt();
		System.out.println("How many times would you like to count 360");
		int number1=input.nextInt();
		for(int i=1;i<=number1;i++){
			increment(number); 
			for (int element: array){ 
				System.out.print(element+" ");
				radianConv(array);
			}
			array.clear();
			System.out.println(" ");
		}
	}
	private static void radianConv(ArrayList<Integer> array2) {
		// TODO Auto-generated method stub
		ArrayList<Double> array1 = new ArrayList<Double>();
		try {
			PrintWriter writer = new PrintWriter("value.txt");
			for (int element: array) {
				double radian  = Math.toRadians( element )  ;
				writer.println(Math.sin(radian));
			}
			writer.close();
		} catch (IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static ArrayList<Integer> increment(int number){
		int sum = 0;
		while(sum<360) 
			if(sum<=360){
				array.add(sum);
				sum+= number;
			}
		array.add(0);
		return array;
	}
}


