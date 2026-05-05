public class InstanceVsLocalVariables {
    int instanceVar = 10;

    void show() {
        int localVar = 5;
        System.out.println("Instance: " + instanceVar);
        System.out.println("Local: " + localVar);
    }

    public static void main(String[] args) {
        InstanceVsLocalVariables obj = new InstanceVsLocalVariables();
        obj.show();
    }
}