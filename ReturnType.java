class ArithmaticOperations {
    int firstNumber;
    int secondNumber;

    ArithmaticOperations(int firstNumber, int secondNumber) {
        /* Constructor */
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

    }

    public int additionOfNumber() {
        /* Integer type returning */
        int additionValue = firstNumber + secondNumber;
        return additionValue;
    }

    public void subractionOfNumbers() {
        /* Void Type */
        System.out.println("Subraction of Numbers is " + (firstNumber - secondNumber));
    }

    public String returnName() {
        /* String type Returning */
        String soundar = "Soundararajan P";
        return soundar;
    }

}

public class ReturnType {

    public static void main(String[] args) {
        String someName;

        ArithmaticOperations myOperations = new ArithmaticOperations(10, 20);

        someName = myOperations.returnName();

        System.out.println("The Addition of number is " + myOperations.additionOfNumber());
    }

}