package ie.tudublin;

public class Animal 
{
    
    // private is local to the class
    private String name;

    // constructor
    // Same name as the class 
    // No return type 
    // if you dont add one, you get a default one
    // once you create one you CAN NOT use the default one
    public Animal(String name)
    {
        setName(name);
    }


    // 
    public String getName()
    {
        return name;
    }

    // 
    public void setName(String name)
    {
        this.name = name;


    }

    public void speak()
    {
        System.out.println("I can't speak!");
    }

    // this gets called automaticailly 
    public String toString()
    {
        return getName();

    }

            
        
    
}