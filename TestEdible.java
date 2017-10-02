package com.company;

public class TestEdible {
    public static void main(String[] args)
    {

        Object[] objects = {new Tiger(),new Chicken(),new Apple()};
        for(int i=0;i<objects.length;i++)
        {
            if(objects[i] instanceof Edible)
                System.out.prinln(((Edible)objects[i]).howToEat());
        }
    }
    class Animal
    {

    }

    class Chicken extends Animal implements Edible
    {
        public String HowToEat()
        {
            return "Chicken: Fry it!";
        }
        public Chicken()
        {}

    }

    class Tiger extends Animal
    {
        public Tiger()
        {}

    }

    abstract class Fruit implements Edible
    {
        

    }

    class Apple extends Fruit
    {
        public String HowToEat()
        {
            return "Apple: just eat!";
        }
    }

    class Orange extends Fruit
    {
        public String HowToEat()
        {
            return "Orange: make juice!";
        }
    }

}
