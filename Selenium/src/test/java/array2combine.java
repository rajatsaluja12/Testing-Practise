import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class array2combine {

	public static void main(String[] args) {
		
		
		String str = "Rakshitttt";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char chArray[] = str.toCharArray();
		for(char c : chArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
				
		
	}
}

	
	


