package chapter20;
import java.util.*;
import java.io.*;
class AvgFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
					int count2=0;
					double sum2=0.0;
			FileWriter fout2=new FileWriter("test.txt");
			fout2.write("2 3.4 5 6 7.4 9.1 10.5 done");
			fout2.close();
			
			FileReader fin2=new FileReader("test.text");
			
			Scanner src2=new Scanner (fin2);
			while (src2.hasNext()) {
				if(src2.hasNextDouble()) {
					sum2+=src2.nextDouble();
					count2++;
					
							}
				else {
					String str2=src2.next();
					if(str2.equals("done"))
						break;
					else {
						System.out.println("File format error.");
						return;
					}
				}
			}
			src2.close();
			System.out.println("Average is  "+ sum2/count2);
		
	}

}
