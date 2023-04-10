import java.lang.*;
import java.util.Scanner;
class Demo  
{  
    int x,y;

    Demo(int x, int y)  
    {  
        this.x=x;
        this.y=y;
        System.out.println("Base class parameterized constructor called");  
    }  
};  
class Prototype extends Demo  
    {  
    Prototype()  
    {  
            this("Java", "Python");  
            System.out.println("Derived class default constructor called");  
    }   
    Prototype(String str1, String str2)  
    {     
        super(10,20);                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        System.out.println("Derived class parameterized constructor called");  
    }  
}  
   class useOfSuper  
    {  
    //main method  
    public static void main(String args[])   
    {   
    //initializes the instance of example class  
    Prototype my_example = new Prototype();  
} 
    }