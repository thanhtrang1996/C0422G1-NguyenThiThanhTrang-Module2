package ss14_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
   private int a;
   private int b;
   private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) throws IllegalTriangle {
        if (a< 0|| b<0||c<0) {
            throw new IllegalTriangle("Tại canh  bạn nhập là số âm");}
        else if (a +b <=c || b+c <= a|| a + c <= b){
            throw new IllegalTriangle("Tổng hai cạnh nhỏ hơn cạnh còn lại");
        }
       else {
        this.a = a;
        this.b = b;
        this.c = c;}

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
