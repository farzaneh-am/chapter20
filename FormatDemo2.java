package chapter20;
import java.util.*;
public class FormatDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Formatter fmt2=new Formatter();

for(double i=1.23;i<1.0e+6;i*=100) {
	fmt2.format("%f %e", i,i);
	System.out.println(fmt2);
}
fmt2.format("%n%n Hex: %x, Octal: %o",196,196);
System.out.println(fmt2);
fmt2.close();
	}

}
