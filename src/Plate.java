import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Plate {
	
	private float x;
	private float y;
	private Image image;
	
	public Plate (float x, float y) throws SlickException{
		this.x = x;
		this.y = y;
		image = new Image("res/block.png");
	}
	
	public void render() {
		  image.draw(x,y);
	}
	
	public void update(){
		x-=3;
	}
}
