package chapter20;
import java.util.*;
public class PrecisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter far=new Formatter();
		far.format("%.4f", 123.1234567);
		System.out.println(far);
	far.close();
	
	
	 far=new Formatter();
	far.format("%16.2e", 123.1234567);
	System.out.println(far);
far.close();

far=new Formatter();
	far.format("%.15s", "Formatting with Java is now easy.");
	System.out.print(far);
far.close();
	}

}
