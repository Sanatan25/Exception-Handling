import java.util.*; 
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your luckey number");
		
		try {
			int n = sc.nextInt();
			if(n < 0) {
				throw new NumberFormatException("negative number");
			}
			else {
				System.out.println("Your luckey number is "+n);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
