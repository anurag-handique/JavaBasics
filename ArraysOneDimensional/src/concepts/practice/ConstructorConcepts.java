package concepts.practice;

class Human {

    int age;
    String name;

 /*
 A constructor is a special method . The constructor name is same-
  -as the class name.A constructor doesn't return anything.All you-
  -need is an access modifier and constructor name!!

  Templete- public name () {

             }

  Important Points-
                    (a). Every time you create an object a constructor is called by itself.
                    (b). That's why what's in the constructor will be called by the object and will be defined.
                    (c). Whenever we want to perfom an operation always perfom it in method.(Standard Java Procedure)
                    (d). Whenever we have two method with same name but different parameters,this is method overloading.
                    (e). Whenever we have two methods having same name and same parameters this is method overidding.
;
  */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ConstructorConcepts {
    public static void main(String[] args) {

    }
}
