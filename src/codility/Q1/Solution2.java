package codility.Q1;

class Duck extends Bird {
    void swim(){
        System.out.println("Duck can swim");
    }
    void sing(){
        System.out.println("Quack Quack");
    }
}

class Chicken extends Bird {
    void fly(){
        System.out.println("Chicken cannot fly");
    }
    void sing(){
        System.out.println("cluck cluck");
    }
}



public class Solution2 {
public static void main(String args[]){
    Chicken chicken =  new Chicken();
    chicken.fly();
    chicken.sing();

    Duck duck =  new Duck();
    duck.swim();
    duck.sing();
}



}
