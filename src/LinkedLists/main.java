package LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class main {
	public static void main(String[] args) {
		// LinkedList<String> placesToVisit=new LinkedList<>();
		var placeToVisit = new LinkedList<String>();
		placeToVisit.add("Sydney");
		placeToVisit.add(0, "Canberra");
		System.out.println(placeToVisit);
		addMoreElements(placeToVisit);
//		removeElements(placeToVisit);
//		System.out.println(placeToVisit);
//		gettingElements(placeToVisit);
//		print(placeToVisit);
//		print3(placeToVisit);
		testIterator(placeToVisit);
	}

	private static void addMoreElements(LinkedList<String> list) {
		list.addFirst("Darwin");
		list.addLast("Hobart");
		// quene methods
		list.offer("mel");
		list.offerFirst("bri");
		list.offerLast("too");
		// stack methods
		list.push("alice");

	}

	private static void removeElements(LinkedList<String> list) {
		list.remove(4);
		list.remove("mel");
		String s1 = list.remove();
		System.out.println(s1 + " was removed");
		String s2 = list.removeFirst();
		System.out.println(s2 + " was removed");
		String p1 = list.poll();
		System.out.println(p1 + " was removed");
		String p2 = list.pollFirst();
		System.out.println(p2 + " was removed");
		String p3 = list.pollLast();
		System.out.println(p3 + " was removed");

		list.push("one");
		list.push("two");
		list.push("three");
		String p4 = list.pop();
		System.out.println(p4 + " was removed");

	}

	private static void gettingElements(LinkedList<String> list) {
		System.out.println("retired element= " + list.get(4));
		System.out.println("first " + list.getFirst());
		System.out.println("last " + list.getLast());

		System.out.println(list.element());
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
	}

	public static void print(LinkedList<String> list) {
		System.out.println(list.getFirst());
		for (int i = 1; i < list.size(); i++) {
			System.out.println("-->from " + list.get(i - 1) + " to " + list.get(i));
		}
		System.out.println(list.getLast());
	}

	public static void print2(LinkedList<String> list) {
		System.out.println(list.getFirst());
		String previous = list.getFirst();
		for (String town : list) {
			System.out.println("from " + previous + " to " + town);
			previous = town;
		}
		System.out.println(list.getLast());
	}

	public static void print3(LinkedList<String> list) {
		System.out.println(list.getFirst());
		String previous = list.getFirst();
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			var town = iterator.next();
			System.out.println("from " + previous + " to " + town);
			previous = town;
		}
		System.out.println(list.getLast());
	}

	private static void testIterator(LinkedList<String> list) {
		var iterator = list.listIterator();
		while (iterator.hasNext()) {
			// System.out.println(iterator.next());
			if (iterator.next().equals("mel")) {
				iterator.add("angel");
			}
		}
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		System.out.println(list);
		
		var iterator2=list.listIterator(4);
		//System.out.println(iterator2.next());
		System.out.println(iterator2.previous());
	}

}