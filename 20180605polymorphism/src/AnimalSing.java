import java.util.*;

public class AnimalSing {

	List<Animal> list;  //Animal의 자식 클래스를 가질 수 있다.
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
