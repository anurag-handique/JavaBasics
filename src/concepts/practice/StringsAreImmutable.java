package concepts.practice;

class Anurag {
    String s1 = "Anurag";
    String s2 = "Anurag";

    public void stringObject() {
        if (s1 == s2) {
            System.out.println("in string object");
        }


    }

}

public class StringsAreImmutable {
    public static void main(String[] args) {

        Anurag obj = new Anurag();
        obj.s2 = "handique";
        obj.s1 = "handique";
        obj.stringObject();
        System.out.println(obj.s1 + obj.s2);


    }
}
  /*
  In the given code, the class Anurag contains two string variables s1 and s2 that are initialized with the same string "Anurag".

The stringObject() method in the Anurag class checks if s1 and s2 are referring to the same object in memory using the == operator.
If they are, it prints "in string object".

In the main method of the StringsAreImmutable class, an object obj of the Anurag class is created and its s1 and s2 variables
 are changed to the string "handique" using the = operator.

However, the = operator does not change the string object itself. Instead, it creates a new string object with the value "handique"
 and assigns its reference to the variable. So, the original string "Anurag" still exists in memory, but it is no longer referred to by any variable.

Therefore, the stringObject() method in the Anurag class will still print "in string object" because s1 and s2 are still referring
to the same object in memory, which is the string "handique". However, this does not mean that strings are not immutable. In fact,
 the original string "Anurag" is still immutable and cannot be changed.

In summary, the code does not demonstrate that strings are not immutable. Rather, it demonstrates that variables that refer to strings
can be reassigned to refer to different string objects, which can create confusion if not properly understood.
   */