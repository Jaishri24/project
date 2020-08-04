package codility.Q1;

import org.junit.jupiter.api.Test;

class AnimalTest{
    @Test
    void walk(){
        System.out.println("im walking");
    }
}

class BirdTest extends AnimalTest {
    @Test
    void walk(){
        System.out.println("im walking");
    }



@Test
    void fly(){
    System.out.println("im walking");
}

@Test
    void sing(){
    System.out.println("im Singing");
}
}