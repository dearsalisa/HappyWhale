import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class GameOver {
	private float x;
	private float y;
	private Image image;

	public GameOver(float x, float y) throws SlickException {
		this.x = x;
		this.y = y;
		image = new Image("res/gameover.png");
	}
	
	public void render() {
		//image.draw(0, 0);
		image.draw(x, y);
	}
}
