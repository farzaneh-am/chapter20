package chapter20;
import java.util.*;
public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		double val;
		double sum =0;
		int bell[]=new int[10];
		for(int i=0;i<100;i++) {
			val=r.nextGaussian();
			sum+=val;
			double t=-2;
			for(int j=0;j<10;j++,t+=0.5)
			if(val<t) {
				bell[j]++;
			break;
			
		}
	}
System.out.println("Average of values: "+sum/100);
for(int i=0;i<10;i++) {
	for(int j=bell[i];j>0;j--)
System.out.print("*");
System.out.println();
}
}
}
