public class Complex {
    // This class rerpresents complex numbers
    private double x;
    private double y;

    public Complex(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public static void display()
    {
        // Print x & y in form X + iY
        System.out.print(this.x + " + i" + this.y);
    }
}
