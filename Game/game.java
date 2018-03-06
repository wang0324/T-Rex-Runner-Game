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
	private static final long serialVersionUID = 1L;
	Cactus jeff;
	Cactus harry;
	Dino dino;
	public void setup() {
		size(1000, 400);
		jeff = new Cactus(400, 210, this, "../assets/cactus1.png");
		harry = new Cactus(600, 230, this, "../assets/shortCactus2.png");
		dino = new Dino(100, 200, this, "../assets/t_rex_running1.png");
		
		
	}
	
	public void draw() {
		background(200);
		line(0, 300, 1000, 300);
		jeff.moveLeft(8);
		harry.moveLeft(8);
		if (jeff.isOffScreenToLeft()) {
			jeff.setPosition((int)(Math.random()*1500 + 300), 210);
		}
		
		else if(harry.isOffScreenToLeft()) {
			harry.setPosition((int)(Math.random()*1500 + 300), 230);
		}
		
		keyReleased();
		jeff.draw();
		harry.draw();
		dino.draw();
		animate();
		counter++;
		
	}
	
	
	public void keyReleased() {
		if (key == ' ') {
			dino.jump();	
			dino.updatePosition();
			
		}
	}
	
	public void animate() {
		if (counter > 10) {
			counter = 0;
			if (count == 0) {
				dino = new Dino(dino.getX(), dino.getY(), this, b);
			count = 1;
			}
			
			else {
				dino = new Dino(dino.getX(), dino.getY(), this, a);
				count = 0;
			}
		}
	}
}
