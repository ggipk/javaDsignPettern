package appleObject;

import java.util.ArrayList;
import java.util.List;

public class AppleMain {
    public static void main(String[] args) {
        ArrayList<Apple> apples= new ArrayList<>();
        apples.add(new Apple(151, "red"));
        apples.add(new Apple(151, "green"));

    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result =new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;

    }
}
