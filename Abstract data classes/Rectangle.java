class Rectangle{
	//Instance Variables
	private double[] bottomLeft;
	private double length;
	private double breadth;

	//Constructors
	public Rectangle(){
		//Null rectangle concept
		length = 1.0;
		breadth = 0.0;
		bottomLeft = new double[2];
		bottomLeft[0] = 0.0;
		bottomLeft[1] = 0.0;
	}

	public Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
		bottomLeft = new double[2];
		bottomLeft[0] = 0.0;
		bottomLeft[1] = 0.0;
	}
	public Rectangle(double length, double breadth, double x, double y){
		this.length = length;
		this.breadth = breadth;
		bottomLeft = new double[2];
		bottomLeft[0] = x;
		bottomLeft[1] = y;
	}
	//Methods

	public double getArea(){
		return length * breadth; 
	}

	public void setBreadth(double breadth){
		if (breadth>=0.0){
			this.breadth = breadth;
		}
	}

	public double getBreadth(){
		return breadth;
	}

	
	public double getLength(){
		return length;
	}
	public void setLength(double length){
		if (length>=0.0){
			this.length = length;
		}
	}
	public double getParimeter(){
		return 2*(length+breadth);
	}

	//  Include "Rectangle intersectWith(Rectangle)" method which computes intersection of "this" rectangle with the argument rectangle and constructs the resulting rectangle and returns the same.
	// In case of no intersection a null rectangle with origin as bottomLeft and length = 0.0 and breadth = 0.0 is returned.
	public Rectangle intersectWith(Rectangle r){
		double x = Math.max(bottomLeft[0], r.bottomLeft[0]);
		double y = Math.max(bottomLeft[1], r.bottomLeft[1]);
		double l = Math.min(bottomLeft[0]+length, r.bottomLeft[0]+r.length) - x;
		double b = Math.min(bottomLeft[1]+breadth, r.bottomLeft[1]+r.breadth) - y;
		if (l<0 || b<0){
			return new Rectangle(0.0,0.0,0.0,0.0);
		}
		return new Rectangle(l,b,x,y);
	}



}


