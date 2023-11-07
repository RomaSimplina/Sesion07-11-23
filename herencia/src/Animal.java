public class Animal {
    private String nombre;
    private double peso;
    private boolean tienePiernas;
    private boolean tieneOjos;

    // Metodo constructor
    public Animal(String nombre, double peso, boolean tienePiernas, boolean tieneOjos) {
        this.nombre = nombre;
        this.peso = peso;
        this.tienePiernas = tienePiernas;
        this.tieneOjos = tieneOjos;
    }

    // Metodos getters y setters
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarNombre() {
        return this.nombre;
    }

    // Metodo funcional
    public void comer() {
        System.out.println("El animal está comiendo!");
    }

    public void moverse() {
        System.out.println("el animal se está moviendo!");
    }

}
