package csi.lopez.sim;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Dog extends JPanel{
	
	
	
	
	
	int size; //ma x weight
	boolean wild = true;
	String hair;
	boolean female; //male = true
	ImageIcon icon;
	
	
	public Dog() {
		// TODO Auto-generated constructor stub
//		initDog();
	}
	
//	private void initDog() {
//
////        addKeyListener(new TAdapter());
//        setBackground(new Color(50, 150, 150));
//        setFocusable(true);
//
//        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
//        
//	}
	
	public Dog(String hair, int size, boolean wild, boolean female, String directory) {
		super();
		this.hair = hair;
		this.size = size;
		this.wild = wild;
		this.female = female;
		this.icon = new ImageIcon(new ImageIcon(getClass().getResource(directory)).getImage().getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH));
	}
	
	public void piss() {
		
		if(female == false) {
			System.out.println("raise leg");
		}
		System.out.println("Tsssssss");
		
	}
	
	public void die() {
		
	}
	
	public void wagTail() {
		
	}
	
	
	public class Shit {

		boolean hard;
		int size;
		String shape;
		ImageIcon icon;
		
		
		public Shit() {
			super();
			this.hard = true;
			this.size = 40;
			this.shape = "long";
			this.icon = new ImageIcon(new ImageIcon(getClass().getResource("shit.png")).getImage().getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH));


		}
		
		public Shit(boolean hard, int size, String shape) {
			super();
			this.hard = hard;
			this.size = size;
			this.shape = shape;
			 
		}


	}
	
	public class Noise {
		int decibels;
		boolean recurring;
		
		
		public Noise() {
			
		}


		public Noise(int decibels, boolean recurring) {
			super();
			this.decibels = decibels;
			this.recurring = recurring;
		}
		
		
		
	}
	
	public class Food {
		public Food(String flavor, String color, boolean humanFood) {
			
		}
		public Food() {
			// TODO Auto-generated constructor stub
		}
		String flavor;
		String color;
		boolean humanFood;
		
		public Shit digest() {
			
			return new Shit();
		}
	}
	
	
	public Shit eat(Food f) {
		
		return f.digest();
	}
	
//	public Noise bark(Noise n) {
//		
//		return new Noise(n.decibels, n.recurring);
//	}
	
	public Noise bark() {
		return new Noise();
	}
	
	public void mate(Dog d) {
		
	}
	
	public void grow() {
		
	}

}
