import java.util.*;

public class AnimalSing {

	List<Animal> list;  //Animal�� �ڽ� Ŭ������ ���� �� �ִ�.
	AnimalSing() {
		list = new ArrayList<Animal>();
	}
	void add(Animal animal) {
		list.add(animal);
	}
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		while (e.hasNext()) {
			ele = e.next();
			ele.sing();
		}
	}
}
