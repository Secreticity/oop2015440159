import java.util.*;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
//		List<String> list = new LinkedList<String>(); Also Possible
		list.add(0, "zero");
		list.add("one");
		list.add("two");
		
		list.add(1,"side");
		System.out.println(list);
	}

}
