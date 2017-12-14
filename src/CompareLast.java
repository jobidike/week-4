import java.util.Comparator;

class CompareLast implements Comparator<Name>{
	public int compare(Name one, Name another) {
		return one.getLName().compareTo(another.getLName());
	}
}
