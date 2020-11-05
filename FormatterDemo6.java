package chapter20;
import java.util.*;
public class FormatterDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Formatter fmt6=new Formatter();
		Calendar cal=Calendar.getInstance();
		
		fmt6.format("Today is day %te of %<tB,%<ty", cal);
		System.out.println(fmt6);
		fmt6.close();
	}

}
