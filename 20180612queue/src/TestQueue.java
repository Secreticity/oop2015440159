import java.util.*;

public class TestQueue {

	public static void main(String[] args) {
		Queue<String> strs = new LinkedList<>();
		
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("putin");
		
		while(!strs.isEmpty()) {
			System.out.println(strs.remove());
		}
	}
}
