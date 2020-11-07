package chapter20;
import java.util.*;
import java.io.*;
public class SetDelimiters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int count3 =0;
double sum3=0.0;
FileWriter fout3=new FileWriter("test.txt");
fout3.write("2,3.4,5,6,7.4,9.1,10.5,done");
fout3.close();
FileReader fin3=new FileReader("Test.txt");
Scanner src3=new Scanner(fin3);
src3.useDelimiter(", *");
while(src3.hasNext()) {
	if(src3.hasNextDouble()) {
		sum3+=src3.nextDouble();
		count3++;
		
	}
	else {
		String str3=src3.next();
		if(str3.equals("done"))
				break;
				else {
					System.out.println("File format error");
					return;
				}
				
	}
}
src3.close();
System.out.println("Average is: "+sum3/count3);
	}

}
