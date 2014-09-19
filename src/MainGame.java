

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;



public class MainGame extends BasicGame {
	
	private Background bg;
	private Whale whale;
	
	public MainGame(String title) throws SlickException {
		super(title);
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		bg.render();
		whale.render();
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		Color background = new Color(128, 128, 128);
	    container.getGraphics().setBackground(background);
	    this.bg = new Background(0,0);
	    this.whale = new Whale(400 ,300);
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args){
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
