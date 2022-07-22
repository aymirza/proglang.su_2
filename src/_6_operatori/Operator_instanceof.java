package _6_operatori;

public class Operator_instanceof {
    public static void main(String[] args) {
        String name =" Олег ";
        // Следующее вернется верно, поскольку тип String
        boolean result = name instanceof String;
        System.out.println(result);
    }
}
