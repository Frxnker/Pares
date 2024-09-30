public class Pares {
    public static void main(String[] args) {
        System.out.println("Introduce 2 números enteros: ");
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());

        System.out.println("Los números pares entre " + a + " y " + b + " son: ");

        while (a <= b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;            
        }
    }
}

