// W.A.P in Java to handle the Exception using try and multiple catch block. {Code - 14}

public class Exception_Using_Try_and_Catch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50 / 0; // Causes ArithmeticException and ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Error: " + e.getMessage());
        }
    }
}
