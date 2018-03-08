package Game;
import processing.core.PApplet;
import processing.core.PImage;

public class Dino {
	// Fields
	PImage img;
	PApplet window;
	private float x, y, yspeed;
	private String filename;
	float gravity;
	// Constructor
	public Dino(float x, float y, PApplet window, String filename) {
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
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
	
	public void jump() {
		if(this.y == 200) {
		this.yspeed = 10;
			this.y -= yspeed;
		updatePosition();
		}
	}
	
	public void updatePosition() {
		if (this.y < 200) {
		this.y = this.y - yspeed;
		this.yspeed = (this.yspeed - this.gravity);
		}
		else {
			this.y = 200;
		}
	}
	
	public isIntervalOverlapping(x1, width1, x2, width2) {
		if (x2 > )
	}
	public boolean isCollidingWithCactus(Cactus cact) {
		boolean xOverlap = isIntervalOverlapping();
	}
	
	

	
	
}