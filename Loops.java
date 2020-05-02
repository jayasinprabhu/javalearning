class Loops {
    public static void main(String[] args) {

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7 };

        /*
         * for (intialization; condition; increment/decrement) {
         * 
         * }
         */

        int oddNumberCount = 0;
        int evenNumberCount = 0;
        int i = 0;


        do{
            System.out.println("The value of i is " + i);
            i++;


        }while(i <= (numbers.length - 1));

        // while (i <= (numbers.length - 1)) {
        //     if (numbers[i] % 2 != 0) {
        //         System.out.println("The number is " + numbers[i] + " odd Number");
        //         oddNumberCount++;
        //     } else {
        //         System.out.println("The number is " + numbers[i] + " even Number");
        //         evenNumberCount++;
        //     }
        //     i++;
        // }

        // for(int i = 0; i <= (numbers.length-1); i++){

        // if( numbers[i]%2 != 0 ) {
        // System.out.println("The number is "+ numbers[i] + " odd Number");
        // oddNumberCount++;
        // } else {
        // System.out.println("The number is "+ numbers[i] + " even Number");
        // evenNumberCount++;
        // }

        // }

        // System.out.println("There are "+ oddNumberCount + " Odd numbers");
        // System.out.println("There are "+ evenNumberCount + " Even numbers");

    }
}