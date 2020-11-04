package chapter20;
import java.util.*;
public class FormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt=new Formatter();
		fmt.format("Formatting %s is easy %d %f","with Java",10 , 98.6);
		System.out.println(fmt);
		fmt.close();

	}

}
