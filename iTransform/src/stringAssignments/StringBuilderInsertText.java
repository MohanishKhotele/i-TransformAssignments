package stringAssignments;

public class StringBuilderInsertText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbl = new StringBuilder("it is used to _ at the specified index position");
		sbl.insert(14, "insert text");
		System.out.println(sbl);
	}

}
