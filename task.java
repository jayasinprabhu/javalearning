class Arithmatic {
    int firstNumber;
    int secondNumber;

    Arithmatic(int firstNumber, int secondNumber) {
        /* Constructor */
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    int addNumbers() {
        return firstNumber + secondNumber;
    }

    int subractNumbers() {
        return firstNumber - secondNumber;
    }

    int division() {
        return firstNumber / secondNumber;
    }

    int multiplication() {
        return firstNumber * secondNumber;
    }


    void showAllCalculations() {

        System.out.println("The First Number is " + firstNumber);
        System.out.println("The second Number is " + secondNumber);
        System.out.println("The Addition of numbers is " + addNumbers());
        System.out.println("The subraction of numbers is " + subractNumbers());
        System.out.println("The division of numbers is " + division());
        System.out.println("The multiplication of numbers is " + multiplication());

    }

}

public class task {
    public static void main(String[] args) {
        
        Arithmatic myOperations = new Arithmatic(10, 10);
        myOperations.showAllCalculations();
    }
}


/*


class Arithmetic
{
public int addition(int add1,int add2)
{
int addnumbers=add1+add2;
return addnumbers;
}
public int subtraction(operation minus)
{
int sub=minus.firstnumber-minus.secondnumber;
return sub;
}
public int multiplication(operation product)
{
int mul=product.firstnumber*product.secondnumber;
return mul;
}
public int division(operation div2nos)
{
int div=div2nos.firstnumber/div2nos.secondnumber;
return div;
}
public String myname(String name)

{
String nickname=name;
return nickname;
}
public void noreturn(String name)
{
System.out.println("My Name is :"+name);
}
}

class operation
{
int firstnumber,secondnumber;
operation(int firstnumber,int secondnumber)
{
this.firstnumber=firstnumber;
this.secondnumber=secondnumber;
}
}

public class soundar
{
public static void main(String args[])
{
Arithmetic functions=new Arithmetic();
operation given=new operation(10,10);
functions.noreturn("Soundararajan P");
System.out.println("Mynick name is "+functions.myname("Kutty"));
System.out.println("Given two number is 10 & 10");
System.out.println("Addition of two number is "+functions.addition(10,10));
System.out .println("Subtrction of two number is "+functions.subtraction(given));
System.out.println("Multiplying two number is "+functions.multiplication(given));
System.out.println("Division of two number is "+functions.division(given));
}

}

*/