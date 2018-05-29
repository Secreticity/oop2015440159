
public class Test {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		String str = new String("Hello");
		
		box.set(str);
		System.out.println("THE box has " + box.get());
		
		Box<Integer> ibox = new Box<>();
		Integer i = new Integer(10);
		
		ibox.set(i);
		System.out.println(100 + ibox.get());
		
//		System.out.println("the box contain " + box.get());
//		int a = 10;
//		box.set(a);
//		System.out.println(10 + box.get());
	}

}
