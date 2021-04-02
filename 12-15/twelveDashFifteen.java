import java.util.*;
import java.io.*;

//Jordan Ashe 04-01-21

class twelveDashFifteen{
	//main
	public static void main(String[] args) throws IOException {
		File txt = new File("Exercise12_15.txt");
		PrintWriter output = new PrintWriter(txt);
		Scanner input = new Scanner(txt); 
		
		for(int i = 0; i < 100; i++){
			output.print((int)(Math.random()*10));
			output.print(" ");
		}
		output.close();
		
		for(int i=0; i < 100; i++)
			System.out.println(input.nextInt());
	}
}