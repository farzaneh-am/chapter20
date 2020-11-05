package chapter20;
import java.util.*;
public class LeftJustify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Formatter fm=new Formatter();

fm.format("|%20.2f|",123.123);
System.out.println(fm);
fm.close();

fm=new Formatter();
fm.format("|%-20.2f|",123.123);
System.out.println(fm);
fm.close();

	}

}
