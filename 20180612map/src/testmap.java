import java.util.*;

public class testmap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		// **.put(key, value)
		// **.get(key)
		map.put("n1", "010-4994-2439");
		map.put("n2", "010-4804-2987");
		map.put("n3", "010-2879-2459");
		
		//System.out.println(map.get("n1"));

		//Iterator usage
		Iterator<String> e = map.keySet().iterator();
		while (e.hasNext()) {
			String key = e.next();
			System.out.println( String.format("Key: %s, Value: %s", key, map.get(key)));
		}
		
		//for usage
		for(String value: map.keySet()) {
			System.out.println(value + ", "+ map.get(value));
		}
		
		for(Map.Entry<String, String> elem : map.entrySet()) {
			System.out.println();
		}
	}
}
