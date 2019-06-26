package programming_test.question1;
import java.util.HashMap;

public class Question1 {
	public void printValue(HashMap<Integer,String> hasMap,int key) {
		System.out.println("Value of the "+key+" is "+hasMap.get(key));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hasMap = new HashMap<>();
		hasMap.put(1, "AAA");
		hasMap.put(2, "BBB");
		hasMap.put(3, "CCC");
		hasMap.put(4, "DDD");
		hasMap.put(5, "EEE");
		Question1 ob = new Question1();
		ob.printValue(hasMap, 3);
	}

}
