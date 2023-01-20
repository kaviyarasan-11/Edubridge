public class Rectangle {
//member variables or instance variable -they are part of object
	//memory allocates only when we create an object
private int length;
private int breadth;
//instance method--method which is called with object
//setter method
public void setLength(int length)//local variable 100
{	//20000
	this.length=length;//this is used to refer to current object
}
//getter method
public int getLength()
{
	return length;
}
public void setBreadth(int br)
{
	breadth=br;
}

public int getBreadth()
{
	return breadth;
}
}
