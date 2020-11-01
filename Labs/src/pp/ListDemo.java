package pp;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

//		List<String> arr = new ArrayList<>();
//		arr.add("ball");
//		arr.add("device");
//		arr.add("pen");
//		arr.add("board");
//		System.out.println(arr);

		ArrayList<String> ls = new ArrayList<>() {
			public void clear() {
				System.out.println("Inside Annonymous Class");
			}

		};

	}

}
