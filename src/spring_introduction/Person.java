package spring_introduction;

import io.micrometer.observation.transport.Propagator;

public class Person {
    private Pet pet;
    //public Person(Pet pet) {
    //    System.out.println("Person bean is created");
    //    this.pet = pet;
   // }

    public Person(){
        System.out.println("Person bean is created");
    }
    // pet-> setPet
    public void setPet(Pet pet) {
        System.out.println("Class Person: Set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello,my lovely Pet!");
        pet.say();
    }
}
