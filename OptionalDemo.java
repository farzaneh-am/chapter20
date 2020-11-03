package chapter20;
import java.util.*;
public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> noval=Optional.empty();
		Optional<String> hasval=Optional.of("ABCDEFG");
		if(noval.isPresent()) System.out.print("This won't be displayed");
		else System.out.println("noVal has no value");
		
		if(hasval.isPresent()) System.out.println("This String in hasVal is: "+ hasval.get());
		String defStr=noval.orElse("Defult String");
		System.out.println(defStr);
		
	}

}
