package ie.tudublin;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Hello");

        // Animal a = new Animal(name);

        // What is Polymorphism? Google it 
        // VERY IMPORTANT !!
        // means the type is obviously a superclass, 
        // and the instance is a subclass. 

        // this is not a Polymorphism
        // Cat ash = new Cat("Ash");

        // this is a Polymorphism
        Animal mino = new Cat("Mino");

        mino.speak();

        // this wont compile cause the program doesnt know that mino is a cat!
        // System.out.println(mino.getNumLives());


        // cast mino to notify the program that mino is a cat ((Cat)mino)
        System.out.println(((Cat)mino).getNumLives());

        // this will compile cause mino is type animal :D
        mino = new Dog("Misty");

        // this wont compile cause ash is type cat
        // ash = new Dog("Tara");

        Animal a = new Cat("a");
        Animal b = new Cat("b");

        // it will call toString method 
        System.out.println(a);
        System.out.println(b);

        a = b;

        a.setName("c");

        // this will print c & c 
        // because string type is a class type 
        // if the values were ints of floats it will print something like c & b
        // what happened?
        // a = b; --> object reference 
        // it takes the pointer of "a" and makes it point to "b" 
        // when resetting value of "a" we are resetting the the same box
        // both varibles point at which was "b" and reset to "c" 
        System.out.println(a);
        System.out.println(b);



    }
}