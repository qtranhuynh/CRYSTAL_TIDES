package entity;

import java.awt.image.BufferedImage;

public class Entity {
	////////////////////////////////////////////////////////////
	public int hp;
	
	public int x, y;
	public int speed;
	
	public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2;
	public BufferedImage idle_up1, idle_up2, idle_down1, idle_down2, idle_left1, idle_left2, idle_right1, idle_right2;
	public String direction;
	
	public int spriteCounter = 0;
	public int spriteNumber = 1;
	////////////////////////////////////////////////////////////
}
