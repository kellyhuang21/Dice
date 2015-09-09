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
	int myX, myY;
	Die(int x, int y) //constructor
	{
		myX=x;
		myY=y;
	}
	void roll()
	{
		num = (int)(Math.random()*6)+1;
		if (num == 1){
			fill(0);
			ellipse(myX, myY,5,5);
		}
	}
	void show()
	{
		noStroke();
		fill(255);
		rect(myX,myY,50,50);

	}
}
