package chapter20;
import java.util.*;
import java.io.*;

public class ScanMixed {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int i;
		double d;
		String str;
		FileWriter fout=new FileWriter("Test.txt");
		fout.write("Testing Scanner 10 12.2 one  two 20 ");
		fout.close();
		
		FileReader fin =new FileReader("Test.txt");
		Scanner src=new Scanner(fin);
		while(src.hasNext()) {
			if(src.hasNextInt()) {
				i=src.nextInt();
				System.out.println("int:"+i);
				}
		
		
			else if(src.hasNextDouble()) {
				d=src.nextDouble();
				System.out.println("double: "+d);
				
			}
			
			else {
				
				str=src.next();
				System.out.println("String: "+str);

	}

}
		src.close();
	}
}
