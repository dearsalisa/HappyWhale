import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Whale {
	
	private float x;
	private float y;
	private Image image;
	
	public Whale (float x, float y) throws SlickException{
		this.x = x;
		this.y = y;
		image = new Image("res/whale2.png");
	}
	
	public void render(){
		image.draw(x, y, (float) 0.3);
	}
	
}
