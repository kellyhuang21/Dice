Die one; 
int num;

void setup()
{
	size(300,300);
	noLoop();
    one = new Die(50,50);
}
void draw()
{
	one.show();
	one.roll();
	
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
		num = 1;
		if (num == 1){
			fill(0);
			ellipse(myX+rectSize/2,myY+rectSize/2,5,5);
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
