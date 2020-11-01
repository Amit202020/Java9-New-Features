package pp;


import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		//takeWhile
		
		//Stream.of("this","is","A"," ","good","book").takeWhile( s ->  !s.isEmpty() ).forEach(System.out::print);
		
		//dropWhile
		//Stream.of("this","is","A","","good","book").dropWhile( s ->  !s.isEmpty() ).forEach(System.out::print);
		
		//iterate
		
		//IntStream.iterate(3 , x ->  x<10 , x -> x+=3 ).forEach(System.out::println);
		
		//oFNullable
		
		long count= Stream.ofNullable(null).count();
		System.out.println(count);
		
		 ProcessBuilder   pb=new ProcessBuilder();
		 
		
	}

}
