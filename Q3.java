import java.util.*;
class MarksOutOfBoundException extends Exception {
	MarksOutOfBoundException(String s) {
		super(s);
	}
}
class Students {
	String name;
	int mark;
	
	Students(String name , int mark) {
		this.name = name;
		this.mark = mark;
	}
	
	public void display() {
		System.out.println(name+" " + mark);
	}
}
public class Q3 {

	public static void main(String[] args) {
		Students s1 = new Students("sanatan",20);
		try {
			if(s1.mark > 100) {
				throw new MarksOutOfBoundException("Mark can not be greater than 100");
			}
			else {
				s1.display();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
