package pp;

import java.util.Arrays;
import java.util.List;



class VarArgDemo {
	
	@SafeVarargs
	private static void show(List<String>... x) {
		for (List<String> i : x) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String args[]) {
		List<String> ls = Arrays.asList("mobile", "rocket", "table", "tree");
		show(ls);
	}
}