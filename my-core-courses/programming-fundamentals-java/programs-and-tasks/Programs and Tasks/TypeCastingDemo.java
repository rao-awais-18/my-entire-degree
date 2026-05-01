public class TypeCastingDemo {
    public static void main(String[] args) {

        int intVal = 10;
        double doubleVal = intVal;

        double d = 9.7;
        int i = (int) d;

        System.out.println("Implicit: " + doubleVal);
        System.out.println("Explicit: " + i);
    }
}