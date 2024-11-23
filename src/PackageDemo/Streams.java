package PackageDemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Streams{
	//@Test
	public void regular() {
		ArrayList<String>name=new ArrayList<>();
		name.add("Sai");
		name.add("Shiva");
		name.add("Kumar");
		List<String> name1=Arrays.asList("Java","Javascript","Python","Ruby");
		name1.stream().filter(s->s.startsWith("J")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("********************************");
		Stream<String> newStream=Stream.concat(name.stream(), name1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		System.out.println("********************************");
		Boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Java"));
		Assert.assertTrue(flag);
	}
	@Test
	public void collectmethod() {
	//int[] nums= {100014,20142,310,04,12,12,4,310};
	List <Integer>values=Arrays.asList(2,5,7,1,2,5,0,1,2,5,10);
	values.stream().distinct().forEach(s->System.out.println(s));
	System.out.println("**************************************");
List<Integer>newvalues=	values.stream().distinct().sorted().collect(Collectors.toList());
System.out.println(newvalues.get(2));
	}
}