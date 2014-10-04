import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Whale {
	
	private float x;
	private float y;
	private Image image;
	
	private float G;
	private float vx;
	
	public Whale (float x, float y) throws SlickException{
		this.x = x;
		this.y = y;
		image = new Image("res/whale2.png");
	}
	
	public void render(){
		image.draw(x, y, (float) 0.3);
	}
	
	public void update() {
	    y += G; 
	}
	
	public void jump(int cnt) {
	    if(cnt%2==0) G = -10;
	    else G = 10;		// ค่า G
	}
}
