public class Hello {
    
    //initialize variables
    private String str;
    
    //constructor
    public Hello()
    {
        str = "Hello";
    }
    
    //methods
    
    //getter
    public String getHello()
    {
        return str;
    }
    
    //setter
    public void setHello(String s)
    {
        if(s.toLowerCase().equals("hello"))
        {
            str = s;
        }
    }
    
    //main method
    public static void main(String[] args)
    {
        System.out.println("hello");
    }
}
