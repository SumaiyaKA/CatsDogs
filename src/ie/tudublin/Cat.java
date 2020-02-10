package ie.tudublin;

public class Cat extends Animal
{
    // right click
    // Source action
    // Generate Getters and setters
    private int numLives;

    public Cat(String name)
    {
        // constructor chaining (google it)
        super(name);

    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    public void speak()
    {
        System.out.println("meow");
    }


}