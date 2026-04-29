
public class LLDriver {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.append(21);
		list.append(34);
		list.append(12);
		list.append(1);
		list.append(67);
		
		list.display();
		System.out.println("Search for 12:" + list.search(12));
		boolean exists = list.search(12);
		if(exists) list.delete(12);
		list.display();

	}

}
