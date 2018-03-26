import java.util.*;
public class ZooTester {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Groot guardian = new Groot(10);
        animals.add(guardian);
        Groot galaxy = new BabyGroot(11);
        animals.add(galaxy);
        
    }
}