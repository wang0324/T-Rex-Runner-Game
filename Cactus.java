import processing.core.PApplet;
import processing.core.PImage;

public class Cactus {
	// Fields
	PImage img;
	PApplet window;
	private int x, y;
	// Constructor
	public Cactus(int x, int y, PApplet window, String filename) {
		this.x = x;
		this.y = y;
		this.window = window;
		this.img = window.loadImage(filename);
		
	}
	
	//draw method
	public void draw() {
		window.image(img, x, y);
	}

	
	
}