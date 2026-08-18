package NestedClasses;

public class StaticNestedClass{
 
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner(); // no object creted of Outer class direct Inner class object created bcoz its static class, so it's directly belong to outer class instead of Outer class object.
        inner.fun();

        Outer.Inner.greet(); // without even inner class and outer class object method is called out bcoz it's static.
    }

    
}
// NOTE: Static nested class can not access non static methods and variables of outer class bcoz the class is not belong to outer class object(basically if variables and methods were accessed by static nested class then they are not found bcoz normal variables and methods are object specific but outer class object is not created).
class Outer{
 
    static class Inner{
        static void greet(){
            System.out.println("hello");
        }
       
        void fun(){
            System.out.println("Having fun");
        }
    }
}