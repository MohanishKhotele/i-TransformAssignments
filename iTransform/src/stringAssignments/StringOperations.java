package stringAssignments;

public class StringOperations {

	public static void main(String[] args) {
		String s = "Java String pool refers to collection of Strings which are stored in heap memory";
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.replace('a', '$'));
		System.out.println(s.contains("collection"));
		
		String s1 = "java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(s.equals(s1));
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(s==s1);

	}

}
