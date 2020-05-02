import java.util.Arrays;

class FindLower {
    public static void main(String[] args) {
        int numbers[] = { 10, 2, 30, 24, 8, 90, 120 };

        Arrays.sort(numbers);


        System.out.println("The smallest number is " +  numbers[0]);
        System.out.println("The Largest number is " +  numbers[numbers.length - 1]);

    }
}