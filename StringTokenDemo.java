package chapter20;
import java.util.StringTokenizer;
class StringTokenDemo {
static String in = "title=Java: The Complete Reference;"+"author=Schildt;"+"copyright=2018";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringTokenizer st=new StringTokenizer(in, "=;");
while (st.hasMoreTokens()) {
String key=st.nextToken();
String val=st.nextToken();
System.out.println(key+"\t"+val);

	}
	}
}


