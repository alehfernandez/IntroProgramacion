public class Coche {

    private int numPuertas;

        public Coche() {
        numPuertas = 0;
    }

        public void anadirPuerta() {
        numPuertas++;
    }

        public int getNumPuertas() {
        return numPuertas;
    }

       public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
