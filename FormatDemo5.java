package chapter20;
import java.util.*;
public class FormatDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fmt5=new Formatter();
		
		fmt5=new Formatter();
		fmt5.format("% d",-100);
		System.out.println(fmt5);
		fmt5.close();
		
		fmt5=new Formatter();
		fmt5.format("% d", 100);
		System.out.println(fmt5);
		fmt5.close();
		
		fmt5=new Formatter();
		fmt5.format("% d",-200);
		System.out.println(fmt5);
		fmt5.close();
		
		fmt5=new Formatter();
		fmt5.format("% d",200);
		System.out.println(fmt5+"\n");
		fmt5.close();
		
		
		fmt5=new Formatter();
		fmt5.format("%(d",-100);
		System.out.println(fmt5+"\n");
		fmt5.close();
		
		fmt5=new Formatter();
		fmt5.format("%,.2f",4356783497.34);
		System.out.println(fmt5+"\n");
		fmt5.close();
	
		
		fmt5=new Formatter();
		fmt5.format("%X",250);
		System.out.println(fmt5+"\n");
		fmt5.close();
		
		fmt5=new Formatter();
		fmt5.format("%E",123.1234);
		System.out.println(fmt5+"\n");
		fmt5.close();
		
		fmt5=new Formatter();
		fmt5.format("%3$d %1$d %2$d",10,20,30);
		System.out.println(fmt5+"\n");
		fmt5.close();
		
		fmt5=new Formatter();
		fmt5.format("%d in hex is %1$x",255);
		System.out.println(fmt5+"\n");
		fmt5.close();
		
		fmt5=new Formatter();
		fmt5.format("%d in hex is %<x",255);
		System.out.println(fmt5+"\n");
		fmt5.close();
		
		
	}

}
