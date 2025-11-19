// Write a program to show the concept of method overriding in Java. {Code - 12}

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}


public class Method_Overriding {
    public static void main(String[] args) {
        Animal obj = new Dog();  // Upcasting
        obj.sound();
    }

}
