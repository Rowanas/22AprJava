package exercises;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayLists {

	public static void cupModule() {
	final List<String> cups = new ArrayList<>();	{
	cups.add("smole cup");
	cups.add("medium cup");
	cups.add("large cup");
	System.out.println(cups);
	for (int i = 0; i <cups.size(); i++)
		System.out.println(cups.get(i));
	for (String i : cups)
		System.out.println(i);
	cups.get(2);
	System.out.println(cups);
	cups.set(2, "swole cup");
	System.out.println(cups);
	cups.remove(1);
	System.out.println(cups);
	Collections.swap(cups, 0, 1);
	System.out.println(cups);
	Collections.sort(cups);
	System.out.println(cups);
	Collections.reverse(cups);
	cups.clear();

			
	}
	}
	
	public static void main(String[] args) {
		cupModule();

	}

}
