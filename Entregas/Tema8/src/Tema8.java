public class Tema8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(36);
        persona.setNombre("Alejandro");
        persona.setTelefono("1141405899");

        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }

}