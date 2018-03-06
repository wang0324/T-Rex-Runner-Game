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
	
	public void moveRight(int distance) {
		this.x += distance;
	}
	
	public void moveLeft(int distance) {
		this.x -= distance;
	}
	
	public void setPosition(int X, int Y) {
		this.x = X;
		this.y = Y;
	}
	
	public boolean isOffScreenToLeft() {
		return (x < 0);
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

	
	
}