package chapter20;
import java.util.*;
public class TimeDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt3=new Formatter();
		Calendar cal=Calendar.getInstance();
		fmt3.format("%tr",cal);
		System.out.println(fmt3);
		fmt3.close();
		
		fmt3=new Formatter();
		fmt3.format("%tc", cal);
		System.out.println(fmt3);
		fmt3.close();
		
		fmt3=new Formatter();
		fmt3.format("%tl:%tM", cal,cal);
		System.out.println(fmt3);
		fmt3.close();
		
		fmt3=new Formatter();
		fmt3.format("%tb %tb %tm", cal,cal,cal);
		System.out.println(fmt3);
		fmt3.close();

	}
}

