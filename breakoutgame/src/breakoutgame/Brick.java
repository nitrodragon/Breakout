package breakoutgame;

import javax.swing.ImageIcon;

public class Brick extends Sprite {

	private boolean dead;
	

	public Brick(int x, int y) {
		
		this.x = x;
		this.y = y;
		
		ImageIcon ii = new ImageIcon("img/brickie.png");
		img = ii.getImage();
		
		i_width = img.getWidth(null);
		i_height = img.getHeight(null);
		
		dead = false;
	}
	
	public boolean isDead() {
		return dead;
	}
	
	public void setDead(boolean isLiving) {
		dead = isLiving;
	}
	
}
