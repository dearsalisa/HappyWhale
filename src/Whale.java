import java.util.ArrayList;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Whale {

	private float x;
	private float y;
	private Image image;
	private int cnt = 0;
	private float G;
	private boolean isJump = true;
	private ArrayList<Plate> plates;

	public Whale(float x, float y, ArrayList<Plate> plates)
			throws SlickException {
		this.x = x;
		this.y = y;
		this.plates = plates;
		image = new Image("res/whale1.png");
	}

	public void render() {
		image.draw(x, y, (float) 0.3);
	}

	public void update() {
		if (!isCollide()) {
			if (cnt % 2 == 0)
				G = -10;
			else
				G = 10;
			y += G;
		} else
			G = 0;
		if (isCollitionBack() == true)
			x -= plates.get(0).getSpeed();
		if(isEnd()) {
			for(int i=0 ; i<plates.size() ; i++)
				plates.get(i).endGame();
		}
	}

	public void jump(int cnt) {
		if (isJump) {
			this.cnt = cnt;
			if (cnt % 2 == 0) {
				y -= 45;
				image = image.getFlippedCopy(false, true);
			} else {
				y += 45;
				image = image.getFlippedCopy(false, true);
			}
		}
	}

	public boolean isCollide() {

		for (int i = 0; i < plates.size(); i++) {
			int temp = 0;
			if (cnt % 2 == 0)
				temp = -40;
			else
				temp = 50;
			if ((plates.get(i).getX() <= x+80 && plates.get(i).getX()
					+ plates.get(i).getWidth() >= x-5)
					&& (plates.get(i).getY() >= y + temp -10 && plates.get(i).getY() <= y + temp + 10)) {
				isJump = true;
				return true;
			}
		}
		isJump = false;
		return false;
	}

	public boolean isCollitionBack() {
		for (int i = 0; i < plates.size(); i++) {
			if ((plates.get(i).getX()-80 <= x && x <=plates.get(i).getX()+80 )
					&& (plates.get(i).getY()-10 <= y && y<=plates.get(i).getY()+40 )) {
				System.out.println("IN : X" + x + " Y" + y);
				return true;
			}
		}
		return false;
	}
	
	public boolean isEnd(){
		if(x<-70 || y>600 || y<0) {
			
			return true;
		}
		else return false;
	}
}
