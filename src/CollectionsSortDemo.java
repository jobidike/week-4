import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {

	public static void main(String[] args) {
		
		
		
//		String a = "a";
//		String b = "b";  
//		
//		System.out.println(b.compareTo(a)); //lowercase letter have a higher order 
//		//this compare to method return us a integar. Letter b is one greater than letter a
//		ArrayList<String> words = new ArrayList<String>();
//		words.add("hello");
//		words.add("hola");
//		words.add("world");
//		words.add("mundo");
//		
//		Collections.sort(words);   //static interface of collections
//		System.out.println(words);
		ArrayList<Name> names = new ArrayList<Name>();
		names.add(new Name("bob","smith"));
		names.add(new Name("fred","jones"));
		names.add(new Name("alan","jones"));
		names.add(new Name("alan","kostrick"));
		names.add(new Name("zach","williams"));

		CompareFirst firstName = new CompareFirst();
		Collections.sort(names, firstName);
		
		System.out.println(names);
	}

}
