package ObjectOrientedPogrammingSystems;

/*
In Java, polymorphism is the ability of an object to take many forms, i.e., it refers to the ability of a variable,
method, or object to take on multiple forms. Specifically, there are two types of polymorphism in Java:

Compile-time Polymorphism (Method Overloading): It occurs when two or more methods in the same class have the same
name but different parameters (number, type, or order). At compile-time, the compiler decides which method to call
based on the arguments passed to the method.

Runtime Polymorphism (Method Overriding): It occurs when a subclass provides its implementation of a method that is
already present in its superclass. The method signature (name, return type, and parameters) should be the same in
both the superclass and the subclass. At runtime, the JVM decides which method to call based on the actual object
type, not the reference type.

In summary, polymorphism is a powerful feature of object-oriented programming that allows objects to behave in
different ways based on their context. It helps in reducing code complexity, increasing code reusability, and
making the code more flexible and extensible.
 */
class A {
    public void show() {
        System.out.println("in A show");
    }

}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }


}

class C extends A {
    public void show() {
        System.out.println("in C show");
    }

}

public class Polymorphism {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();


    }
}
