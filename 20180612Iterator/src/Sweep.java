import java.util.*;

public class Sweep {

	public static void main(String[] args) {
//		Set<String> strs = new HashSet<>();
//		//Common methods : add(), remove(), sweep...
//		strs.add("trump");
//		strs.add("jungeun");
//		strs.add("jaein");
//		strs.add("putin");

		Set<String> strs = new LinkedHashSet<>();
		//Common methods : add(), remove(), sweep...
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("putin");
		
//		Set<String> strs = new TreeSet<>();
//		//Common methods : add(), remove(), sweep...
//		strs.add("trump");
//		strs.add("jungeun");
//		strs.add("jaein");
//		strs.add("putin");
		
//		//First whole search method : iterator
//		Iterator<String> e = strs.iterator();
//		while(e.hasNext()) {
//			String str = e.next();
//			System.out.println(str);
//		}
		
		//Second whole search method : for() loop usage
		for(String str1: strs) {
			System.out.println(str1);
		}
		
		
	}
}
