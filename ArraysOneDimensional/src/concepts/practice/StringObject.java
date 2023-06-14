package concepts.practice;

public class StringObject {
    public static void main(String[] args) {
        String s1 = "hello"; // s1 refers to a String object in the pool
        String s2 = "hello"; // s2 refers to the same String object in the pool as s1

        String s3 = new String("hello"); // s3 refers to a new String object in the heap memory
        String s4 = new String("hello"); // s4 refers to another new String object in the heap memory, even though the content is the same as s3

        System.out.println(s1 == s2); // prints true, because s1 and s2 refer to the same object in the pool
        System.out.println(s1 == s3); // prints false, because s1 refers to an object in the pool, while s3 refers to a new object in the heap memory
        System.out.println(s3 == s4); // prints false, because s3 and s4 refer to different objects in the heap memory
/*
  In Java, the String pool is a part of the heap memory and is a special area reserved for storing String literals.
  When you create a String object using a String literal or constant, Java first checks if the same String already
  exists in the String pool. If it does, then a reference to the existing String object is returned. If not, then a
  new String object is created in the String pool.

  However, if you create a new String object using the new keyword, even if the content of the String is the same as
  an existing String in the pool, a new String object will be created in the heap memory. This is because the new keyword
  always creates a new object and does not reuse objects from the pool.
 */
    }
}
