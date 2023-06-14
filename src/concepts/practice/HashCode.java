package concepts.practice;

import java.util.Objects;

class IPad {

    String model;
    int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IPad iPad)) return false;
        return price == iPad.price && model.equals(iPad.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    public String toString() {
        return model + " : " + price;//is By DEfault created by java.
    }

}


public class HashCode {
    public static void main(String[] args) {
        IPad obj = new IPad();
        obj.model = "lenovo";
        obj.price = 10000;

        IPad obj1 = new IPad();
        obj1.model = "lenovo";
        obj1.price = 10000;
        boolean result = obj==obj1;

        System.out.println(result);


    }
}
