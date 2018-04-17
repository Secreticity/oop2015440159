
public class Animal {

	//field
	public String name;
	//constructor
	public Animal(String name) {
		this.name = name;
	}
	//methods
	public void sing() {
		System.out.println(name + " Sing");
	}
	public String getName() {
		return name;
	}
}
