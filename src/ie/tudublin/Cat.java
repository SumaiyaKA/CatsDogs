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


    public void setName()
    {
        
    }

    public void setNumLives()
    {
        
    }

    public void speak()
    {
        System.out.println("meow");
    }


    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

}