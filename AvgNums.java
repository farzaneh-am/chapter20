package chapter20;
import java.util.*;
public class AvgNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner conin=new Scanner(System.in);
int count=0;
double sum=0.0;
System.out.println("Enter numbers to average.");

while(conin.hasNext()) {
	if(conin.hasNextDouble()) {
		sum+=conin.nextDouble();
		count++;
				}
	else
	{
		String str=conin.next();
		if(str.equals("done"))
			break;
		else {
			System.out.println("Date format error.");
			return;
		}
	}
}
conin.close();
System.out.println("Average is "+sum/count);
	}

}
