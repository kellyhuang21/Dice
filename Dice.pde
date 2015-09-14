Die one; 
int num;

void setup()
{
	size(700,455);
	noLoop();
    
}
void draw()
{
	for (int y = 10; y<400; y+= 55){
		for (int x = 10; x<400; x+= 55){
			Die one = new Die(x,y);
			one.show();
			one.roll();
		}
	}

}
void mousePressed()
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
	void roll()
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
	void show()
	{
		int rectSize = 50;
		noStroke();
		fill(255);
		rect(myX,myY,rectSize,rectSize);

	}
}
