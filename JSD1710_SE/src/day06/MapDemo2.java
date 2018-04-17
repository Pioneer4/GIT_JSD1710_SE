package day06;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collection;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Math", 100);
		map.put("Englis", 90);
		map.put("physics", 100);
		map.put("geometry", 70);
		map.put("geography", 60);
		System.out.println(map);
		
		Set<String> keySet = map.keySet();
		for (String str : keySet) {
			System.out.println(str);
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> e : entrySet) {
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key + ": " + value);
		}
		
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
	}
}
