public class Tema3 {

 /* Enunciado del ejercicio:

        Primera parte:

        Crear una función con tres parámetros que sean números que se suman entre sí.

        Llamar a la función en el main y darle valores.

        Segunda parte:

        Crear una clase coche.

        Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

        Una función que incremente el número de puertas que tiene el coche.

        Crear un objeto miCoche en el main y añadirle una puerta.

        Mostrar el número de puertas que tiene el objeto. */


    public static void main(String[] args) {


        int resultado = sumarTresNumeros(2, 4, 6);
        System.out.println("el resultado de la suma es " + resultado);

        Coche miCoche = new Coche();
        miCoche.anadirPuerta();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas");
    }


        public static int sumarTresNumeros(int num1, int num2, int num3) {
            int suma = num1 + num2 + num3;
            return suma;
    }
}
