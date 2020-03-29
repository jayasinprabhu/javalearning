class Person {
/* Data types */
String name;
int age;
String district;


/* To create the function we need to follow the syntax 

public void <functionName>() {

} 

*/

public void showDetails() {
    System.out.println(" Name : " + name);
    System.out.println(" age : " + age);
    System.out.println(" District : " + district);
}

}

class FunctionClassExplanation {

    public static void main(String[] args) {

        /* syntax to create object from class 
        <classname> <anyname(OBJECT)> = new <classname>();
        */

        Person soundar = new Person();
        Person prathib = new Person();
        Person suresh = new Person();

        soundar.name = "Soundararajan P";
        soundar.age = 25;
        soundar.district = "Namakkal";

        soundar.showDetails();

        prathib.name = " PRATHIB TV";
        prathib.age = 23;
        prathib.district = "NAMAKKAL";

        prathib.showDetails();

        suresh.name = " SURESH BABU P";
        suresh.age = 23;
        suresh.district = "NAMAKKAL";

        suresh.showDetails();

        
    }

}