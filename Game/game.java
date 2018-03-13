package Game;
import java.util.ArrayList;
import processing.core.PApplet;
public class game extends PApplet {
	/*
	 if there is a class error, make sure the core.jar in properties
	 is where you stored core.jar, the core.jar in my program is the one 
	 on the school computer
	 */
	private int speed = 8, timer = 0, count = 0;
	private static final long serialVersionUID = 1L;
	private boolean game = true;
	Cactus jeff;
	Cactus harry;
	Dino dino;
	ArrayList <Dot> dots = new ArrayList<Dot>();
	public void setup() {
		size(1000, 400);
		jeff = new Cactus(2000, 210, this, "../assets/cactus1.png");
		harry = new Cactus(1500, 230, this, "../assets/shortCactus2.png");
		dino = new Dino(100, 100, this, "../assets/t_rex_running1.png");
		for (int i = 0; i < 150; i++) {
			Dot tempDot = new Dot((int)(Math.random()*1000), (int)(Math.random() * 300),(int)(Math.random()*10 + 3) ,this);
			dots.add(tempDot);
		}
		
		
	}
	
	public void draw() {
		background(200);
		line(0, 300, 1000, 300);
		jeff.moveLeft(speed);
		harry.moveLeft(speed);
		dino.updatePosition();
		if (jeff.isOffScreenToLeft()) {
			jeff.setPosition((int)(Math.random()*1000 + 800), 210);
		}
		
		else if(harry.isOffScreenToLeft()) {
			harry.setPosition((int)(Math.random()*1000 + 800), 230);
		}
		
		if((dino.isCollidingWithCactus(harry) || dino.isCollidingWithCactus(jeff))) {
			text("Game Over!", 100, 100);
			speed = 0;
			game = false;
			
		}
		jeff.draw();
		harry.draw();
		dino.draw(count, game);
		count++;
		if (count > 20) {
			count = 0;
		}
		timer++;
		if (timer > 250) {
			speed++;
			timer = 0;
		}
		
		for (int location = 0; location < dots.size(); location++) {
			Dot tempDot = dots.get(location);
			
			tempDot.moveLeft();
			tempDot.draw();
			
		}
		
	}
	
	
	public void keyPressed() {
		if (key == ' ' && game) {
			dino.jump();	
			game = true;
		}
	}
	
}
