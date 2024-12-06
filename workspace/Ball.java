//
//  Class author:  Emilie Spindler
//  Date created:  12.2.24
//  General description: Draws circle to create ball object that can move.
//
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int radius;
	private int XVel;
	private int YVel;
	
	//constructor(s):
	public Ball(int initX, int initY, int initRadius){
		x= initX;
		y= initY;
		radius = initRadius;
		XVel=0;
		YVel=0;
	}

	//methods:

	public int getXpos(){
		return x;
	}
	public int getYpos(){
		return y;
	}
	public int getSize(){
		return radius;
	}

	public void setX(int newX){
		x=newX;
	}
	public void setY(int newY){
		 y=newY;
	}

	public void setXVelocity(int Xvelocity){
		XVel = Xvelocity;
	}
	public void setYVelocity(int Yvelocity){
		YVel=Yvelocity;
	}

	//
	//  Pre-condition: ball must be drawn first useing the draw() method
	//  Post-condition: moves the ball up or down, and/or left or right based on the velocity
	//
	public void move(){
		x+=XVel;
		y+=YVel;
	}

	//
	//  Pre-condition: paramenter cannot be anything other than "g"
	//  Post-condition: Draws the ball on the game
	//
	public void draw(Graphics g){
		g.setColor(Color.white);
		g.fillOval(x, y, radius, radius);
	}

	//
	//  Pre-condition: the ball should be moving left or right for the reverse method to execute anything
	//  Post-condition: if the ball is moving left, it will move right and vise versa
	//
	public void reverseX(){
		XVel=-XVel;
	}
	//
	//  Pre-condition: the ball should be moving up or down for the reverse method to execute anything
	//  Post-condition: if the ball is moving left, it will move right and vise versa
	//
	public void reverseY(){
		YVel=-YVel;
	}

}
