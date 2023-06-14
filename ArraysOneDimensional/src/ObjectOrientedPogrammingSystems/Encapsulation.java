package ObjectOrientedPogrammingSystems;

class Human {
     private int age = 11;
     private String name = "Anurag";

     public int getAge() {
         return age;
     }
     public String getName(){
         return  name;
     }


}

public  class Encapsulation {

    public static void main(String[] args) {

        Human obj = new Human();

      //  obj.getAge = 32;
     //   obj.getName = "anurag";


        System.out.println(obj.getName()+":"+obj.getAge());
    }
}