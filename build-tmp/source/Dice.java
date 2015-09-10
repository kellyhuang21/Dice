import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die one; 
int num;

public void setup()
{
	size(300,300);
	noLoop();
    one = new Die(50,50);
}
public void draw()
{
	one.show();
	one.roll();
	
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	//variable declarations here
	int myX, myY;
	Die(int x, int y) //constructor
	{
		myX=x;
		myY=y;
	}
	public void roll()
	{	
		int rectSize = 50;
		num = 1;
		if (num == 1){
			fill(0);
			ellipse(myX+rectSize/2,myY+rectSize/2,5,5);
		}
	}
	public void show()
	{
		int rectSize = 50;
		noStroke();
		fill(255);
		rect(myX,myY,rectSize,rectSize);

	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
