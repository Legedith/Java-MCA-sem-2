class UseRectangle{

	public static void main(String[] args){
		Rectangle first = new Rectangle();
		Rectangle second = new Rectangle(7.0,3.0);
		Rectangle third = new Rectangle(5.0,2.0,1.0,2.0);
		first = second.intersectWith(third);
		// print length, breadth area and perimeter of the resulting rectangle
		System.out.println("Length: "+first.getLength());
		System.out.println("Breadth: "+first.getBreadth());
		System.out.println("Area: "+first.getArea());
		System.out.println("Parimeter: "+first.getParimeter());

		// System.out.println("The second rectangle breadth is "+second.getBreadth());
		
		

	}

}
