package csi.lopez.inheritance;

public class Dog {
	
	String hair;
	int size; //ma x weight
	boolean wild = true;
	
	

	public Dog() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	public void piss() {
		
	}
	
	public void die() {
		
	}
	
	public void wagTail() {
		
	}
	
	
	public class Shit {

		boolean hard;
		int size;
		String shape;
		
		
		public Shit() {

		}
		
		public Shit(boolean hard, int size, String shape) {
			super();
			this.hard = hard;
			this.size = size;
			this.shape = shape;
		}


	}
	
	public class Noise {
		public Noise(int i, boolean b) {
			// TODO Auto-generated constructor stub
		}
		int decibels = 0;
		boolean recurring = false;
	}
	
	public class Food {
		public Food(String flavor, String color, boolean humanFood) {
			
		}
		String flavor;
		String color;
		boolean humanFood;
	}
	
	
	public Shit eat(Food f) {
		
		return new Shit();
	}
	
	public Noise bark(Noise n) {
		
		
		return new Noise(n.decibels, n.recurring);
	}

}
