package Game;
import processing.core.PApplet;
public class game extends PApplet {
	/*
	 if there is a class error, make sure the core.jar in properties
	 is where you stored core.jar, the core.jar in my program is the one 
	 on the school computer
	 */
	private String a = "../assets/t_rex_running1.png", b = "../assets/t_rex_running2.png";
	protected int count = 0, counter = 0;
	private int speed = 8, timer = 0;
	private static final long serialVersionUID = 1L;
	private boolean game = true;
	Cactus jeff;
	Cactus harry;
	Dino dino;
	public void setup() {
		size(1000, 400);
		jeff = new Cactus(2000, 210, this, "../assets/cactus1.png");
		harry = new Cactus(1500, 230, this, "../assets/shortCactus2.png");
		dino = new Dino(100, 100, this, "../assets/t_rex_running1.png");
		
		
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
		dino.draw();
		//animate();
		timer++;
		if (timer > 500) {
			speed++;
			timer = 0;
		}
		
	}
	
	
	public void keyPressed() {
		if (key == ' ' && game) {
			dino.jump();	
			game = true;
		}
	}
	
}
