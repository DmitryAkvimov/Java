package gb;

import gb.goods.Milk;
import gb.goods.Water;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Milk goodMilk = new Milk(200.50,
                "thystry",
                LocalDateTime.of(2024, 10, 6, 3, 1),
                1, "white");

        Milk goodMilk2 = new Milk(200.50,
                "thystry",
                LocalDateTime.of(2024, 10, 6, 3, 1),
                1, "white");


        LocalDateTime creationDate = goodMilk.creationDate;
        double price = goodMilk.price;

        String color = goodMilk.color;

        Good milkGood = new Milk(150D,
                "kawhgohyo",
                LocalDateTime.now(), 1,
                "white");

        Water water1 = new Water(150D,
                "kawhgohyo",
                LocalDateTime.now(),
                1,
                true);

        System.err.println(milkGood.getGoodType());

        Set<Good> goods = new HashSet<>();

        goods.add(milkGood);
        goods.add(goodMilk);
        goods.add(water1);
        goods.add(goodMilk2);

        milkGood.addGroup(123);
        milkGood.addGroup(321);

        System.out.println(milkGood.getGroups());

        milkGood.getGroups().clear(); // тут поможет реализация геттера

        System.out.println(milkGood.getGroups());

        System.out.println(goods);


//        milkGood.setPrice(1000);
        goods.add(milkGood);

        System.out.println(goods);

    }

}
