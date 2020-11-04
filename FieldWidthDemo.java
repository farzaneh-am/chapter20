package chapter20;
import java.util.*;
public class FieldWidthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt4;
		for(int i=1;i<=10;i++) {
			fmt4=new Formatter();
		fmt4.format("%4d %4d %4d", i,i*i,i*i*i);
		System.out.println(fmt4);
	fmt4.close();


	}

}
}
