// W.A.P in Java that import the user define package and access the Member variable of 
// classes that Contained by Package. {Code - 13}

// File: mypackage/MyClass.java
package mypackage;

public class MyClass {
    public int x = 10;
}

// File: PackageDemo.java (Main class)
import mypackage.MyClass;

public class PackageDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("Value from package: " + obj.x);
    }
}
