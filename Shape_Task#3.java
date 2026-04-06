package Lab08Task03;

interface Shape {
    void calculateArea();
}

class Circle implements Shape {
    @Override
    public void calculateArea(){
        System.out.println("Area of circle calculated.");
    }
}

class Rectangle implements Shape {
    @Override
    public void calculateArea(){
        System.out.println("Area of rectangle calculated.");
    }
}

class Main {
    public static void main (String[] args){
        Shape c = new Circle();
        c.calculateArea();

        Shape r = new Rectangle();
        r.calculateArea();
    }
}