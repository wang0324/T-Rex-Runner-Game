package Game;
import java.util.ArrayList;
import processing.core.PApplet;
public class game extends PApplet {
	/*
	 if there is a class error, make sure the core.jar in properties
	 is where you stored core.jar, the core.jar in my program is the one 
	 on the school computer
	 */
	private int speed = 8, count = 0,score = 0;
	private boolean game = true;
	private String display;
	Cactus jeff;
	Cactus harry;
	Dino dino;
	ArrayList <Dot> dots = new ArrayList<Dot>();
	public void setup() {
		size(1000, 400);
		jeff = new Cactus(2000, 210, this, "../assets/cactus1.png");
		harry = new Cactus(1500, 230, this, "../assets/shortCactus2.png");
		dino = new Dino(100, 100, this, "../assets/t_rex_running1.png");
		for (int i = 0; i < 50; i++) {
			Dot tempDot = new Dot((int)(Math.random()*1000), (int)(Math.random() * 300),2 ,this);
			dots.add(tempDot);
		}
		
		for (int i = 50; i < 100; i++) {
			Dot tempDot = new Dot((int)(Math.random()*1000), (int)(Math.random() * 300),10,this);
			dots.add(tempDot);
		}
		
		for (int i = 100; i < 150; i++) {
			Dot tempDot = new Dot((int)(Math.random()*1000), (int)(Math.random() * 300),15 ,this);
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
		
		display = Integer.toString(score);
		text("Score :" + display, 300, 100);
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

		if (score % 100 == 0) {
			speed++;
		}
		
		for (int location = 0; location < dots.size(); location++) {
			Dot tempDot = dots.get(location);
			
			tempDot.moveLeft();
			tempDot.draw();
			
		}
		if (game) {
		score++;
		}
		
	}
	
	
	public void keyPressed() {
		if (key == ' ' && game) {
			dino.jump();	
			game = true;
		}
	}
	
}
