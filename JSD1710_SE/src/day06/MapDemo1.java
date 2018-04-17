package day06;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Chinese", 99);
		map.put("math", 100);
		map.put("English", 98);
		map.put("physics", 100);
		map.put("chemistry", 95);
		
		System.out.println(map);
		
		Integer num = map.put("Chinese", 60);
		System.out.println(map);
		System.out.println(num);
		
		System.out.println(map.get("English"));
		System.out.println(map.get("biology"));
		System.out.println(map.get("geography"));
		
		Integer score = map.remove("physics");
		System.out.println(map);
	}
}
