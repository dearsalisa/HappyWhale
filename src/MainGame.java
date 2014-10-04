

import java.util.ArrayList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;



public class MainGame extends BasicGame {
	
	private Background bg;
	private Whale whale;
	private ArrayList<Plate> plates;
	private int cnt=0;
	
	public MainGame(String title) throws SlickException {
		super(title);
		plates = new ArrayList();
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		bg.render();
		whale.render();
		for(int i=0 ; i<plates.size() ; i++)
			plates.get(i).render();
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		Color background = new Color(128, 128, 128);
	    container.getGraphics().setBackground(background);
	    this.bg = new Background(0,0);
	    this.whale = new Whale(100 ,300);
	    //this.plate = new Plate(0,0);
	    builder();
	}
	
	private void builder() throws SlickException{
		plates.add(new Plate(0,100));
		plates.add(new Plate(300,150));
		plates.add(new Plate(600,100));
		plates.add(new Plate(0,400));
		plates.add(new Plate(300,450));
		plates.add(new Plate(600,400));
	}
	
	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		whale.update();
		for(int i=0 ; i<plates.size() ; i++)
			plates.get(i).update();
	}
	
	@Override
	  public void keyPressed(int key, char c) {
	    if (key == Input.KEY_SPACE) {
	      // do something
	    	cnt++;
	    	whale.jump(cnt);
	    }
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
