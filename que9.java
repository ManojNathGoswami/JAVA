//WAP to show constructor chaining in java.
import java.lang.*;
import java.util.Scanner;
// class love{
//     love(){
//         this("my");
//         System.out.println("India");
//     }
//     love(String s){
//         this("love","I");
//         System.out.println(s);
//     }
//     love(String m,String p){
//         System.out.println(m+" "+p);
//     }
//     public static void main(String arg[]){
//         love India=new love();
//     }
// }
class Demo  
{  

    
    Demo(int x, int y)  
    {  
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
        System.out.println("Derived class parameterized constructor called");  
    }  
}  
   class ConstructorChaining  
    {   
    public static void main(String args[])   
    {    
        Prototype my_example = new Prototype();  
} 
    }  
