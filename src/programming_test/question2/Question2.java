package programming_test.question2;

class Instrument{
	private String name;
	public String[] sound;
	
	public void playSound() {
		System.out.println("Playing sound form Instrument");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}

class StringInstrument extends Instrument{
	
	public void playSound(int stringNumber) {
		System.out.println("Playing sound from Stirng Instrument");
		System.out.println("String Insturment has"+stringNumber+"of string");
	}
}

class WindInsturment extends Instrument{

	public void playSound(float windSpeed) {
		System.out.println("Playing sound from Wind Insturment");
		System.out.println("It has "+windSpeed+"of wind speed");
	}
}

class Musician{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void playInstrument(Instrument insturment) {
		System.out.println(this.name+" play "+insturment.getName());
	}

}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
