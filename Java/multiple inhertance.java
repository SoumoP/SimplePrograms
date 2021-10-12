// example of multiple inheritance in java
class Number {
    protected int a;
    protected int b;
}

interface Arithmetic {
    public int add(int a, int b);

    public int sub(int a, int b);
}

class Userinterface extends Number implements Arithmetic {
    public int add(int a, int b) {
        return (a + b);
    }

    public int sub(int a, int b) {
        return (a - b);
    }

    public int mul(int a, int b) {
        return (a * b);
    }

    public int div(int a, int b) {
        return (a / b);
    }

    public static void main(String[] args) {
        Userinterface ui = new Userinterface();
        System.out.println("When a = 10 and b = 5");
        System.out.println("Addition = " + ui.add(10, 5));
        System.out.println("Subtraction = " + ui.sub(10, 5));
        System.out.println("Multiplication = " + ui.mul(10, 5));
        System.out.println("Division = " + ui.div(10, 5));
    }
}