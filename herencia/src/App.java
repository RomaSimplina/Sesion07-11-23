public class App {
    public static void main(String[] args) {
        // Vamos a crear un objeto de ambas clases
        Animal animal = new Animal("Dragon de Komodo", 400.00, true, true);
        Perro yupi = new Perro("Yupi", 23, true, true, true, true, "Chow chow");
        animal.comer();
        yupi.comer();
    }
}
