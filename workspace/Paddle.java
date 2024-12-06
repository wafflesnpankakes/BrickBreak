//
//  Class author:  Emilie Spindler
//  Date created:  12.2.24
//  General description: Draws Rectangle to create the paddle  object that 
//	the user will move left and right to bounce the ball back and play the game.
//

import java.awt.*;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;

	
	//constructor(s):
	public Paddle(int initX, int initY, int initWidth, int initHeight){
		x= initX;
		y= initY;
		width = initWidth;
		height= initHeight;
		velocity=0;
	}
	//methods:
	//
	//  Pre-condition: paramenter cannot be anything other than "g"
	//  Post-condition: Draws the paddle on the game
	//
	public void draw (Graphics g){
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}

	//
	//  Pre-condition: paddle must be drawn first useing the draw() method
	//  Post-condition: moves the paddle left or right based on the velocity
	//
	public void move(){
		x+=velocity;
		if (velocity>0){
			velocity--;
		}
		else if (velocity<0){
			velocity++;
		}
	}

	//
	//  Pre-condition: any number for parameter
	//  Post-condition: makes the paddle go faster or slower when moving it left and right.
	//
	public void addVelocity(int addNum){
		velocity+=addNum;
		
	}

	public void setVelocity(int num){
		velocity = num;
	}

	public void setX(int newX){
		x = newX;
	}

	public int getVelocity(){
		return velocity;
	}

	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}

	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
}
