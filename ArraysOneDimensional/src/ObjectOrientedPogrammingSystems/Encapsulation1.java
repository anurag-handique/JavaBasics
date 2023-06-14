package ObjectOrientedPogrammingSystems;

class Members {
    private int age =30;
    private String name = "Anurag";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

class Encapsulation1 {
    public static void main(String[] args) {
        Members obj = new Members();

         // obj.age = 32;
        // obj.name = "Anurag";

       // System.out.println(obj.name + " : " + obj.age);
        System.out.println(obj.getName()+" : "+obj.getAge());
    }

}
