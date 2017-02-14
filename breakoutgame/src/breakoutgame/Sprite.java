package breakoutgame;

import java.awt.Image;
import java.awt.Rectangle;

public class Sprite {

	protected int x;
	protected int y;
	protected int i_width;
	protected int i_height;
	protected Image img;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return i_width;
	}

	public int getHeight() {
		return i_height;
	}
	
	Image getImg() {
		return img;
	}
	
	Rectangle getRect() {
		return new Rectangle(x, y, img.getWidth(null), img.getHeight(null));
	}
	
}
