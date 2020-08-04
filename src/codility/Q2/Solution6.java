package codility.Q2;

import codility.Q1.Bird;

class Butterfly extends Bird {
    void fly(){
        System.out.println("ButterFly can fly   ");
    }

    void sing(){
        System.out.println("Butterfly doesnt make sound");
    }

}

class Caterpillar extends Bird{
    void fly(){
        System.out.println("caterpillar cannot fly   ");
        System.out.println("caterpillar can walk   ");
    }


}

public class Solution6 {
    public static void main(String[] args){
        Butterfly b = new Butterfly();
        b.fly();
        b.sing();

    }
}
