class PrintMyName {

    public void printMyName(String name) {
        System.out.println(name);
    }

    public void findSquareRoot(int number){
        System.out.println("The Square root of " + number + " is " + (number * number));
    }

    public void multiplyNumber(int firstNumber, int SecondNumber) {
        System.out.println("The multiplication value of "+ firstNumber + " and " + SecondNumber + " is "+ (firstNumber * SecondNumber)); 
    }
    
    public void printDetails(MyNumbers abc){
        System.out.println("Name of the object is " + abc.name);
        System.out.println("Fav Number " + abc.favNumber);

    }

    public void showThreeNumbers(NumbersList mynumberList) {
        System.out.println(mynumberList.firstNumber);
        System.out.println(mynumberList.secondNumber);
        System.out.println(mynumberList.thirdNumber);

    }
}


class NumbersList {
    int firstNumber;
    int secondNumber;
    int thirdNumber;
    NumbersList() {
        System.out.println(" NumberList Initalized ");
    }
}

class MyNumbers {
    int favNumber;
    String name;
    MyNumbers(int number, String myName) {
        /* Constructor - Initialize the value upon object creation */
        favNumber = number;
        name = myName;

    }
}


public class ConstructorExplanation {
    public static void main(String[] args) {

        PrintMyName someName = new PrintMyName();


        MyNumbers soundar = new MyNumbers(7, "Soundararajan P");
        //someName.printDetails(soundar);

        NumbersList abc = new NumbersList();

        // NumbersList myThreeNumbers = new NumbersList();
        // myThreeNumbers.firstNumber = 1;
        // myThreeNumbers.secondNumber = 2;
        // myThreeNumbers.thirdNumber = 3;

        // someName.showThreeNumbers(myThreeNumbers);



    }

}