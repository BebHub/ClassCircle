Myclass.java;
public class Myclass
{
    private static final float Pi = 3.14159265359f;
    private float diameter = 0f;
    private void setDiameter(float diameter)
    {
        this.diameter = diameter;
    }
    private float getDiameter()
    {
        return diameter;
    }
    private float getRadius()
    {
        return diameter/2;
    }
    public void setRadius(float radius)
    {
        diameter  = radius*2;
    }
    public float getArea()
    {
        return getRadius()*getRadius()*Pi;
    }
    public float getCircumference()
    {
        return 2*Pi*getRadius();
    }
    public Myclass()
    {
        float diameter = 0f;
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert Diameter: ");
        diameter = scan.nextFloat();
        scan.nextLine();
        setDiameter(diameter);
        System.out.println("Area: "+getArea()+"\nCircumference: "+getCircumference());
    }
        public static void main(String[] args) {
                new Myclass();
        }
}
