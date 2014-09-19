import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;




public class Background {
	
	private float x;
	private float y;
	private Image image;
	
	public Background (float x, float y) throws SlickException{
		this.x = x;
		this.y = y;
		image = new Image("res/bg.png");
	}
	
	public void render() {
		  image.draw(0,0);
	}
	
}
