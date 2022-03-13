package comparatorVsComparable.comparator;

import java.util.Comparator;

class NameComparator implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
