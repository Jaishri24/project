package codility.Q2;

interface common{
    public  void  swim();
}
class ClownFish extends Fish{
    void appearance(){
        System.out.println("Clownfish are small and colourfull");
    }
    void attributes(){
        System.out.println("Clownfish makes jokes");
    }
}

class Shark extends Fish{
    void appearance(){
        System.out.println("shark are large and grey");
    }
    void attributes(){
        System.out.println("shark eats other fish");
    }
}

class Dolfin implements common{

    @Override
    public void swim() {
        System.out.println("Dolphins are good swimmers");
    }
}
public class Solution5 {
    public static void main(String[] args){
        Shark s= new Shark();
        ClownFish cf = new ClownFish();
        Dolfin d = new Dolfin();
        s.appearance();
        s.attributes();
        cf.appearance();
        cf.attributes();
        d.swim();
    }
}
