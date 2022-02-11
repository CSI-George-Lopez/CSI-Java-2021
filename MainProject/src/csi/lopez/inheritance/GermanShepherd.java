package csi.lopez.inheritance;

public class GermanShepherd extends Dog{

	public GermanShepherd() {
		
		super("brown", 40, false, false, "GermanShepherd.png");
		
	}
	
	@Override
	public Noise bark() {

		return new Noise(120, false);
	}
	
	
	public void wagTail() {
		
		System.out.println("Woosh Loudly");
		
	}
	
	public Shit eat() {

		return new Shit(true, 3, "Banana");
	}
}
