public class Perro extends Animal {

    private boolean tienecola;
    private boolean tieneOrejas;
    private String raza;

    // Metodo constructor
    public Perro(String nombre, double peso, boolean tienePiernas, boolean tieneOjos, boolean tieneCola,
            boolean tieneOrejas, String raza) {
        super(nombre, peso, tienePiernas, tieneOjos);
        this.tienecola = tieneCola;
        this.tieneOrejas = tieneOrejas;
        this.raza = raza;
    }

    // metodos funcionales
    public void masticar() {
        System.out.println(super.mostrarNombre() + " está masticando!");
    }

    // Aplicando polimorfismo
    @Override // Notacion
    public void comer() {
        System.out.println(super.mostrarNombre() + " está comiendo!");
        masticar();
        super.comer();
    }

}
