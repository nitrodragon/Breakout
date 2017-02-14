package breakoutgame;

import javax.swing.ImageIcon;

public class Ball extends Sprite implements Commons {

	private int xdir;
	private int ydir;
	
	public Ball() {
		
		xdir = 1;
		ydir = -1;
		
		ImageIcon ii = new ImageIcon("img/ball.png");
		img = ii.getImage();
		
		i_width = img.getWidth(null);
		i_height = img.getHeight(null);
		
		resetState();
	}
	
	public void move() {
		
		x += xdir;
		y += ydir;
		
		if (x == 0) { 
			setXDir(1);
		}
		if (x == WIDTH - i_width) {
	        setXDir(-1);
	    }

	    if (y == 0) {
	        setYDir(1);
	    }
	}

	public void setXDir(int i) {
		xdir = i;
		
	}

	public void setYDir(int i) {
		ydir = i;
	}
	
	public int getYDir() {
		return ydir;
	}

	private void resetState() {
	
		x = INIT_BALL_X;
		y = INIT_BALL_Y;
		
	}
	
	
}
