package chapter20;
import java.util.*;
public class FormatDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt4=new Formatter();
		fmt4.format("Farzaneh is%nVery good%n%d%%", 100);
		System.out.print(fmt4);
	fmt4.close();

	}

}
