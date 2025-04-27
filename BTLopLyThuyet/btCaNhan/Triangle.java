
public class Triangle {
    private int a;
    private int b;
    private int c;
    public float calculateArea(){
        return (float) (Math.abs(((float)(this.a-this.b)/2.0)*(this.c)));
    }
    
}
