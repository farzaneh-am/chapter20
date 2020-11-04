package chapter20;
import java.util.*;
public class FormatDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt5=new Formatter();
		fmt5.format("|%f|%n|%12f|%n|%012f|",10.12345,10.12345,10.12345);
		System.out.print(fmt5);
	fmt5.close();

	}

}
