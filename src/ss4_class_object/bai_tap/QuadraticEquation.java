package ss4_class_object.bai_tap;
public class QuadraticEquation {
   private float a,b,c;
   private float delta;
   private double x1,x2;
    public QuadraticEquation (float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
        public float getA() {
            return a;
        }

        public void setA(float a) {
            this.a = a;
        }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    public float getDiscriminant(){
       delta  = this.b*this.b - 4*this.a*this.c;
       return delta;
    }
    public double getRoot1(){
        x1 = (-this.b + Math.sqrt(delta))/(2*this.a);
        return x1;
    }
    public double getRoot2(){
        x2 = (-this.b + Math.sqrt(delta))/(2*this.a);
        return x2;
    }
}
