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
	size(700,455);
	noLoop();
    
}
public void draw()
{
	for (int y = 10; y<400; y+= 55){
		for (int x = 10; x<400; x+= 55){
			Die one = new Die(x,y);
			one.show();
			one.roll();
		}
	}

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
		num = (int)(Math.random()*6)+1;
		if (num == 1){
			fill(0);
			ellipse(myX+rectSize/2,myY+rectSize/2,5,5);
		}
		else if (num == 2){
			fill(0);
			ellipse(myX+rectSize/4,myY+rectSize/4,5,5);
			ellipse(myX+3*rectSize/4,myY+3*rectSize/4,5,5);
		}
		else if (num == 3){
			fill(0);
			ellipse(myX+rectSize/2,myY+rectSize/4,5,5);
			ellipse(myX+rectSize/2,myY+rectSize/2,5,5);
			ellipse(myX+rectSize/2,myY+3*rectSize/4,5,5);
		}
		else if (num == 4){
			fill(0);
			ellipse(myX+rectSize/4,myY+rectSize/4,5,5);
			ellipse(myX+3*rectSize/4,myY+3*rectSize/4,5,5);
			ellipse(myX+rectSize/4,myY+3*rectSize/4,5,5);
			ellipse(myX+3*rectSize/4,myY+rectSize/4,5,5);
		}
		else if (num == 5){
			fill(0);
			ellipse(myX+rectSize/4,myY+rectSize/4,5,5);
			ellipse(myX+3*rectSize/4,myY+3*rectSize/4,5,5);
			ellipse(myX+rectSize/4,myY+3*rectSize/4,5,5);
			ellipse(myX+3*rectSize/4,myY+rectSize/4,5,5);
			ellipse(myX+rectSize/2,myY+rectSize/2,5,5);
		}
		else if (num == 6){
			fill(0);
			ellipse(myX+rectSize/4,myY+rectSize/4,5,5);
			ellipse(myX+3*rectSize/4,myY+3*rectSize/4,5,5);
			ellipse(myX+rectSize/4,myY+3*rectSize/4,5,5);
			ellipse(myX+3*rectSize/4,myY+rectSize/4,5,5);
			ellipse(myX+rectSize/4,myY+2*rectSize/4,5,5);
			ellipse(myX+3*rectSize/4,myY+2*rectSize/4,5,5);
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
