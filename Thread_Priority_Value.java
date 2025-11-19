public class Thread_Priority_Value {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("Akarsh Thread");	
	System.out.println(t);
    }
}
