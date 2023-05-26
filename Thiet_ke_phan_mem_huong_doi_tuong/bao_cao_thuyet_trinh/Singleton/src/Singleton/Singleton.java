package Singleton;

public class Singleton {
    private static Singleton instance;

    private int a;
    private int b;

    private Singleton(int a, int b) {
        // private constructor
        this.a = a;
        this.b = b;
    }

    public static Singleton getInstance(int a, int b) {
        if (instance == null) {
            instance = new Singleton(a,b);
        }
        return instance;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void print() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
