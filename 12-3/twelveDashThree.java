import java.util.*;

//Jordan Ashe 03-31-21

class twelveDashThree{
	//main
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		int plrchoice = 0;
		
		for(int i=0; i < 100; i++){
			array[i] = (int)(Math.random()*10);
		}
		
		System.out.println("Please enter an index of the array.");
		plrchoice = input.nextInt();
		
		try {
			if((plrchoice < 0) || (plrchoice > 99))
				throw new Exception("Out of Bounds!");
		} catch (Exception e) {
			System.out.println(e);
			System.exit(1);
		}
		
		System.out.println(array[plrchoice]);
		
	}
}