package csi.lopez.inheritance;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class DogPound extends JPanel{
	
	List<Dog> dogs = new ArrayList<Dog>();
	private int B_WIDTH = 800;
	private int B_HEIGHT = 800; 
	
    private boolean inGame = true;

	
	private Image shepherd; 
	
	  public DogPound() {
	        
	        initBoard();
	    }
	    
	   private void initBoard() {

//	        addKeyListener(new TAdapter());
	        setBackground(new Color(50, 150, 150));
	        setFocusable(true);

	        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
	        loadImages();
	        
	    }
	   
	   
	   public void loadImages() {

	        ImageIcon iid = new ImageIcon(getClass().getResource("GermanShepherd.png"));
	        shepherd = iid.getImage();
	        
	   }
	   
	   public void actionPerformed(ActionEvent e) {
		   
		   
		if(inGame) {
			   
//			   checkCollision();
//			   move();
		   }
	        

	        repaint();
	    }

	   
	   
	   public void paintComponent(Graphics g) {
		   super.paintComponent(g);
		   
		   g.drawImage(shepherd, 0, 0, null);
	   }
	    
//	    public static void main(String[] args) {
//	    	
//	    }
	
	

}
