package chapter20;
import java.util.*;

 class LRBDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle rd=ResourceBundle.getBundle("SampleRB");
		
		System.out.println("English version: ");
		
		System.out.println("String For Title Key: "+rd.getString("title"));
		
		System.out.println("String For StopText Key: "+rd.getString("StopText"));
		
		System.out.println("String For StartText Key: "+rd.getString("StartText"));
		
		rd=ResourceBundle.getBundle("SampleRB",Locale.GERMAN);
		
		System.out.println("\nGerman version: ");
		System.out.println("String For Title Key: "+rd.getString("title"));
		System.out.println("String For StopText Key: "+rd.getString("StopText"));
		System.out.println("String For StartText Key: "+rd.getString("StartText"));
		
	}
}
 public class SampleRB extends ListResourceBundle{
		protected Object [][] getContents(){
			Object[][] resources=new Object [3] [2];
			
			resources[0][0]="title";
			resources[0][1]="My program";
			
			resources[1][0]="StopText";
			resources[1][1]="Stop";
			
			resources[2][0]="StartText";
			resources[2][1]="Start";
			return resources;
		}
	}
	 class SampleRB_de extends ListResourceBundle{
			protected Object[][] getContents1(){
				Object[][] resources=new Object[3][2];
				resources[0][0]="title";
				resources[0][1]="Mein programm";
				
				resources[1][0]="StopText";
				resources[1][1]="Anschlag";
				
				resources[2][0]="StartText";
				resources[2][1]="Anfang";
				return resources;
			}

			@Override
			protected Object[][] getContents() {
				// TODO Auto-generated method stub
				return null;
			}
	}

