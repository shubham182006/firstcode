 class thsdemo {
   int num = 3;   // instance variable

    public void set() {
        num++;
    }

    public void get() {
        System.out.println(num);
    }
}

class Main {
    public static void main(String[] args) {
        thsdemo ob1 = new thsdemo();
        thsdemo ob2 = new thsdemo();
        thsdemo ob3 = new thsdemo();

        ob1.set();   // num=4 in ob1
        ob1.set();   // num=5 in ob1
        ob2.set();   // num=4 in ob2
        ob3.set();   // num=4 in ob3
        ob3.set();   // num=5 in ob3
        ob3.set();   // num=6 in ob3

        ob1.get();   // prints 5
        ob2.get();   // prints 4
        ob3.get();   // prints 6
    }
}
