package HashMapConcepts;

import java.util.AbstractMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String>  map16 = Stream.of(

				new AbstractMap.SimpleEntry<>("A1","1651"),
				new AbstractMap.SimpleEntry<>("B1","21")

				).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue));

		System.out.println(map16.get("A1"));
		map16.put("LIZA", "3");
		System.out.println(map16.get("LIZA"));


		ConcurrentHashMap<String, String> map1 = new ConcurrentHashMap<String,String>();
		map1.put("test", "t1");
		map1.put("test2", "t2");

		map1.forEach((k,v)-> System.out.println(k+v));


	}

}
