package codility.Q1;

class Rooster extends Bird{
    void sing(){
        System.out.println("Cock-a-doodle-doo");
    }
}

public class Solution3 {
    public static void main(String[] args){
        Rooster r = new Rooster();
        r.sing();
    }
}
