package chapter20;
import java.util.*;
public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date =new Date();
		System.out.println(date);
		long msec=date.getTime();
		System.out.println("Milliseconds since Jan.1,1970 GMT="+msec);
		

	}

}
