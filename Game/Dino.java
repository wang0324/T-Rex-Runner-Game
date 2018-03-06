package Game;
import processing.core.PApplet;
import processing.core.PImage;

public class Dino {
	// Fields
	PImage img;
	PApplet window;
	private int x, y, yspeed;
	float gravity;
	// Constructor
	public Dino(int x, int y, PApplet window, String filename) {
		this.x = x;
		this.y = y;
		this.window = window;
		this.img = window.loadImage(filename);
		this.yspeed = 10;
		this.gravity = 0.4f;
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
	
	public void jump() {
		if(y > 150) {
		this.y -= yspeed;
		}
	}
	
	public void updatePosition() {
		if (this.y < 200) {
		this.y -= yspeed;
		this.yspeed -= this.gravity;
		}
		else {
			this.y = 200;
		}
	}
	
	

	
	
}