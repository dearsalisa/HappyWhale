
import java.util.ArrayList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class MainGame extends BasicGame {

	private Background bg;
	private Whale whale;
	private ArrayList<Plate> plates;
	private int cnt = 0;
	private int score = 0;

	public MainGame(String title) throws SlickException {
		super(title);
		plates = new ArrayList();
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		bg.render();
		whale.render();
		arg1.drawString("Score : " + score, 600, 20);

		for (int i = 0; i < plates.size(); i++)
			plates.get(i).render();
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		Color background = new Color(128, 128, 128);
		container.getGraphics().setBackground(background);
		this.bg = new Background(0, 0);
		this.whale = new Whale(200, 300, plates);
		// this.plate = new Plate(0,0);
		builder();
	}

	private void builder() throws SlickException {
		int a = 0, b = 0;

		plates.add(new Plate(a += 200, 100));
		plates.add(new Plate(a += 250, 150));
		plates.add(new Plate(a += 250, 100));

		plates.add(new Plate(a += 400, 150));

		plates.add(new Plate(a += 400, 200));

		plates.add(new Plate(a += 450, 200));
		plates.add(new Plate(a += 250, 150));
		plates.add(new Plate(a += 250, 100));

		plates.add(new Plate(a += 800, 100));
		plates.add(new Plate(a += 300, 100));

		plates.add(new Plate(a += 400, 100));

		// --------------------//

		plates.add(new Plate(b += 100, 400));
		plates.add(new Plate(b += 250, 450));
		plates.add(new Plate(b += 250, 400));
		plates.add(new Plate(b += 250, 400));

		plates.add(new Plate(b += 400, 400));

		plates.add(new Plate(b += 400, 450));

		plates.add(new Plate(b += 800, 400));
		plates.add(new Plate(b += 250, 400));
		plates.add(new Plate(b += 250, 450));
		plates.add(new Plate(b += 250, 500));

		plates.add(new Plate(b += 500, 450));
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		whale.update();
		for (int i = 0; i < plates.size(); i++)
			plates.get(i).update();
		if (!whale.isEnd())
			score += 1;
	}

	@Override
	public void keyPressed(int key, char c) {
		if (key == Input.KEY_SPACE) {
			// do something
			cnt++;
			whale.jump(cnt);
		}
	}

	public static void main(String[] args) {
		try {
			MainGame game = new MainGame("Happy Whale :)");
			AppGameContainer appgc = new AppGameContainer(game);
			appgc.setDisplayMode(800, 600, false);
			appgc.setMinimumLogicUpdateInterval(1000 / 60);
			appgc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
