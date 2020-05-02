
class ConditionalStatements{
    public static void main(String[] args) {
        // if , if else, if else if ladder, switch case,

        int firstNumber = 10;
        int secondNumber = 20;
        String operation = "subraction";

        // firstNumber > secondNumber
        // firstNumber < secondNumber
        // firstNumber = secondNumber

        if(firstNumber > secondNumber){
            System.out.println(" The firstNumber is greater than second Number");
        } else if(firstNumber == secondNumber) {
            System.out.println("Both the numbers are equal");
        } else {
            System.out.println(" The second number is greater than first Number");
        }


        /**
         * switch(exp){
         * case 0:
         * break;
         * case 1:
         * break;
         * default:
         * break
         * 
         * }
         * 
         * 
         * 
         * 
         */

        switch(operation){
            case "Addition":
            System.out.println("The sum of numbers is "+  (firstNumber + secondNumber));
            break;
            case "subraction":
            System.out.println("The difference of numbers is "+  (firstNumber - secondNumber));
            break;

        }


        

    }
}
