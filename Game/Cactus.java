package Game;
import processing.core.PApplet;
import processing.core.PImage;

public class Cactus {
	// Fields
	PImage img;
	PApplet window;
	private float x, y;
	private float width;
	// Constructor
	public Cactus(float x, float y, PApplet window, String filename) {
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
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
	
	public float getWidth() {
		return img.width;
	}
	
	public float getHeight() {
		return img.height;
	}
	
	

	
	
}