int num;
void setup()
{
	noLoop();
}
void draw()
{
	Dice one = new Dice(50,50);
	one.roll();
	one.show();
}
void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	//variable declarations here
	Die(int x, int y) //constructor
	{
		myX=x;
		myY=y;
	}
	void roll()
	{
		
		num = (int)(Math.random*6)+1;
	}
	void show()
	{
		noStroke();
		fill(255);
		rect(myX,myY,50,50);

	}
}
