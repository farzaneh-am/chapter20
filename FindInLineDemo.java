package chapter20;
import java.util.*;
public class FindInLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String instr= "Name: Farzaneh Age: 39 ID: 97";
		Scanner conin=new Scanner(instr);
		conin.findInLine("Age:");
		if(conin.hasNext())
			System.out.println(conin.next());
		else
			System.out.println("Error!");
		conin.close();
	}

}
