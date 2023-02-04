package lib;

import java.util.Vector;

public class Repos {
	private Vector<Human> people;
	public Repos() {
		people = new Vector<Human>();
	}
	public void addHuman(Human human) {
		people.add(human);
	}
	
	public void delHuman(int index) {
		people.remove(index);
	}
	
	public Human getHuman(int index) {
		try {
			return people.get(index);
		}catch(ArrayIndexOutOfBoundsException ex) {
			return null;
		}
	}
	
	public void display() {
		if(people.isEmpty()) {
			System.out.println("Human list is empty");
		}else {
			int N = people.size();
			System.out.printf("There are %d humans\n",N);
			for(int i=0; i<N; i++) {
				System.out.printf("%d. %s \n", i+1, people.get(i).getName());
			}
		}
	}
	
	public int findHuman(String name) {
		for(int i=0; i < people.size(); i++) {
			if(people.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
