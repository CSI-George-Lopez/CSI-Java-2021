package csi.lopez.inheritance;

public class GermanShepherd extends Dog{

	public GermanShepherd() {
		super();
		this.size = 40;
		this.wild = false;
		this.hair = "brown";
	}
	
	public Noise bark() {

		return new Noise(120, true);
	}
	
	public Shit eat() {

		return new Shit(true, 3, "Banana");
	}
}
