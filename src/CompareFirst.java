import java.util.Comparator;

class CompareFirst implements Comparator<Name>{
	public int compare(Name one, Name another) {
		return one.getFName().compareTo(another.getFName());
	}
}
