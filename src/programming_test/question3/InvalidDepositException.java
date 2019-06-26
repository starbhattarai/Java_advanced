package programming_test.question3;

public class InvalidDepositException extends Exception {
	public InvalidDepositException() {
		super("You can not deposit the negative amount, Please deposit the positive amount");
	}
}
