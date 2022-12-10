package task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Box <String, Banana> bananaBox = new Box<>("banana", new Banana());
        bananaBox.getObj().printClass();
        Box<String, Apple> appleBox = new Box<>("apple", new Apple());
        appleBox.getObj().printClass();
        Box<String, Fruit> fruitBox = new Box<>("fruit", new Fruit());
        fruitBox.getObj().printClass();
        VegetableBox<String, Vegetable> vegetableBox = new VegetableBox<>("vegetable", new Vegetable());
        vegetableBox.getObj().printClass();
        VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();
    }
}