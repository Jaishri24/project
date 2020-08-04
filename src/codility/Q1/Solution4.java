package codility.Q1;


class parrot extends Bird{

    private String animal;

    parrot(String animal){
        this.animal = animal;
        if(animal.equalsIgnoreCase("dog")){
            System.out.println("woof woof");
        }else if(animal.equalsIgnoreCase("cat")){
            System.out.println("meow");
        }else if(animal.equalsIgnoreCase("rooster")){
            System.out.println("cock-a-doodle-doo");
        }
    }


}
public class Solution4 {
    public static void main(String[] args){
        parrot p = new parrot("dog");
    }
}
