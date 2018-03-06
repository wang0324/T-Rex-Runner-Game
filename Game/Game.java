package Game;
import processing.core.PApplet;
import processing.core.PImage;

public class Game extends PApplet {
	Cactus jeff;
	
	public void setup() {
		size(800, 400);
		
		jeff = new Cactus(400, 200, this, "../assets/cactus1.png");
		
	}
	
	public void draw() {
		background(255);
		
		jeff.draw();
		
	}
}
