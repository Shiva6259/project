package Tutorial;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class test1 {
	@Test
	public void regular() {
	ArrayList<String> names=new ArrayList<String>();
	names.add("Shiva");
	names.add("Sai");
	names.add("Karthik");
	names.add("abhi");
	int count=0;
	for(int i=0;i<names.size();i++) {
	String actual=	names.get(i);
	if(actual.startsWith("S")) {
		count++;
	}
	}
	System.out.println(count);
}
}