package com.JavaLearn;
public class ConditionalOperator {
    public static void main(String[] args) {
int a=10;
int b=15;
int c=20;


           //boolean-expression ? expression1 : expression2
          //it will print expression1 if boolean is true
         // it will print expression2 if boolean is false
        // int max is a type of conditional operator

        int max=a < b ? a : b;
        int min=b > c ?  b : c ;
        int max1=a < b ? b :  a;
        int min1=b > c ? c : b;
        System.out.println(max);
        System.out.println(min);
        System.out.println(max1);
        System.out.println(min1);

        //print a name if it exists
        //if the string is empty print the name is not valid and if it is not empty print //RELIANCE COLLEGE

        String name= "RELIANCE COLLEGE";

        System.out.println(name.isEmpty() ? "The name is not valid": name);

        //USING NOT OPERATOR
            String name1= "DAYANAND VIDYA NIKETAN";
            System.out.println( !name1.isEmpty() ? name1 : "the name is not valid");
    }
}
