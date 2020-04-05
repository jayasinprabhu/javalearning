class Rectangle {

    int length;
    int breth;

    public void calculateArea() {
         int area = length * breth;
         System.out.println("The Area of rectangle is " + area);
    }

}

public class FunctionExplanation2 {

    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle();
        myRectangle.length = 100;
        myRectangle.breth = 20;
        // myRectangle.myname ="";

        myRectangle.calculateArea();

    }

}