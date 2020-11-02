package animal;

public class Bovino extends Animal {
	
	protected Bovino() {
		super();
	}

	public String toString( ) {
		return String.valueOf(getId()) + "B. " + super.toString();
	}
}
