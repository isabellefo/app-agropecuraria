package animal;

public class Suino extends Animal {
	
	protected Suino() {
		super();
	}
	
	public String toString( ) {
		return String.valueOf(getId()) + "S. " + super.toString();
	}

}
