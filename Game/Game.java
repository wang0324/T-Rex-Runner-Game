package Game;
import processing.core.PApplet;
import processing.core.PImage;

public class Game extends PApplet {
	Cactus jeff;
	Cactus harry;
	
	public void setup() {
		size(800, 400);
		line(1000, 1000, 1000, 1000);
		jeff = new Cactus(400, 200, this, "../assets/cactus1.png");
		harry = new Cactus(600, 200, this, "../assets/shortCactus2.png");
		
	}
	
	public void draw() {
		background(200);
		
		jeff.moveLeft(8);
		harry.moveLeft(8);
		if (jeff.isOffScreenToLeft()) {
			jeff.setPosition(rand(800), 200);
		}
		
		else if(harry.isOffScreenToLeft()) {
			harry.setPosition(rand(800), 200);
		}
		jeff.draw();
		harry.draw();
		
	}
	
	public int rand(int a) {
		return (int)(Math.random() * a);
	}
}
