import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Plate {

	private float x;
	private float y;
	private float width;
	private Image image;
	private float speed = 5;
	private boolean isEnd = false;

	public Plate(float x, float y) throws SlickException {
		this.x = x;
		this.y = y;
		image = new Image("res/block.png");
		this.width = image.getWidth();
	}

	public void render() {
		image.draw(x, y);
	}

	public void update() {
		if (!isEnd) {
			x -= speed;
			speed += 0.001;
			if (x <= -3000)
				x = 1000;
		}
	}

	public void endGame() {
		isEnd = true;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float getSpeed() {
		return speed;
	}

	public float getWidth() {
		return width;
	}
}
