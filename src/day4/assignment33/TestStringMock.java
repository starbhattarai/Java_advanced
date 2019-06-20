package day4.assignment33;

public class TestStringMock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "What's in the name";
		StringMock stringMock = new StringMock();
		System.out.println(stringMock.search(message,'n'));
		System.out.println(stringMock.search(message,'z'));
	}

}
