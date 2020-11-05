package chapter20;
import java.util.*;
public class FormatDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Formatter fmt7=new Formatter()) {
			fmt7.format("Formatting %s is easy %d %f", "with Java", 10 , 98.6);
			System.out.println(fmt7);
			
		}

	}

}
