package day4.assignment32;
import java.lang.reflect.*;

public class TestReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class classObj = Class.forName("Employee");
			System.out.println(classObj.getMethods());
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
