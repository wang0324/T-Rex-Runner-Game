package Game;

import processing.core.PApplet;

public class Dot {
	PApplet window;
	private float x, y, speed;
	
	public Dot(float x, float y,float speed,PApplet window) {
		this.x = x;
		this.y = y;
		this.window = window;
		this.speed = speed;
		
	}
	
	public void moveLeft() {
		if (x > 0) {
			this.x -= this.speed;
		}
		else {
			this.x = 1000;
		}
	}
	
	public void draw() {
		window.ellipse(this.x, this.y, 2, 2);
	}
}
