public class Tema4 {

    public static void main(String[] args) {
        int numeroIf = -5;
        if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es 0");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Valor de la variable en el While: " + numeroWhile);
        }

        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("Valor de la variable en el Do While: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Valor de la variable en el For: " + numeroFor);
        }

        String estacion = "otoño";
        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("La estación no es válida");
        }
    }
}
