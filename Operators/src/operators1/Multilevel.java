package operators1;

class Animal {
    void eat() {
        System.out.println("EAT");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }

    class BabyDog extends Dog {
        void weep() {
            System.out.println("Weeping");
        }
    }
}

public class Multilevel {

    public static void main(String[] args) {
        // To access BabyDog, first instantiate Dog, then access BabyDog as an inner class
        Dog.BabyDog d = new Dog().new BabyDog(); 
        
        d.eat();   // Accessing method of Animal class
        d.bark();  // Accessing method of Dog class
        d.weep();  // Accessing method of BabyDog class
    }
}
