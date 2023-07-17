import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String colours[] = new String[4];
		System.out.println("Enter the colours");
		for(int i = 0; i < colours.length; i++) {
			colours[i] = sc.nextLine();
		}
		try {
			Integer.parseInt(colours[0]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println("Enter another colour");
			colours[5] = sc.nextLine();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Colours entered are:-");
		for(int i = 0; i < colours.length; i++) {
			System.out.println(colours[i]);
		}
		

	}

}
