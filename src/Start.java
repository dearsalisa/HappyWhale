import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Start {
	private float x;
	private float y;
	private Image image;

	public Start(float x, float y) throws SlickException {
		this.x = x;
		this.y = y;
		image = new Image("res/start.jpg");
	}
	
	public void render() {
		image.draw(0, 0);
	}
}
