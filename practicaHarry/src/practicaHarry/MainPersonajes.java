package practicaHarry;

public class MainPersonajes {
    public static void main(String[] args) {
        wizard1();
        wizard2();
        wizard3();
        wizard4();
        wizard5();
    }

    public static void wizard1(){
        String msg = "\nPersonajes de Harry Potter: \n";
        Personaje harry = new Personaje();
        harry.setNombre("Harry James Potter");
        harry.setGenero("Masculino");
        harry.setCasa("Gryffindor");
        harry.setPatronus("Ciervo");
        harry.setBoggart("Dementor");

        msg += "\nNombre: " +harry.getNombre();
        msg += "\nGenero: " +harry.getGenero();
        msg += "\nCasa: " +harry.getCasa();
        msg += "\nPatronus: " +harry.getPatronus();
        msg += "\nBoggart: " +harry.getBoggart();
        msg += "\n";

        System.out.println(msg);
    }

    public static void wizard2() {
        Personaje dumbledore = new Personaje();
        dumbledore.setNombre("Albus Percival Wulfric Brian Dumbledore");
        dumbledore.setGenero("Masculino");
        dumbledore.setCasa("Gryffindor");
        dumbledore.setPatronus("Fenix");
        dumbledore.setBoggart("Su hermana Ariana");

        String msg = "Nombre: " +dumbledore.getNombre();
        msg += "\nGenero: " +dumbledore.getGenero();
        msg += "\nCasa: " +dumbledore.getCasa();
        msg += "\nPatronus: " +dumbledore.getPatronus();
        msg += "\nBoggart: " +dumbledore.getBoggart();
        msg += "\n";

        System.out.println(msg);
    }

    public static void wizard3(){
        Personaje voldemort = new Personaje();
        voldemort.setNombre("Tom Marvolo Riddle");
        voldemort.setGenero("Masculino");
        voldemort.setCasa("Slytherin");
        voldemort.setPatronus("Sin Patronus");
        voldemort.setBoggart("Su propio cuerpo muerto");

        String msg = "Nombre: " +voldemort.getNombre();
        msg += "\nGenero: " +voldemort.getGenero();
        msg += "\nCasa: " +voldemort.getCasa();
        msg += "\nPatronus: " +voldemort.getPatronus();
        msg += "\nBoggart: " +voldemort.getBoggart();
        msg += "\n";

        System.out.println(msg);
    }

    public static void wizard4(){
        Personaje bellatrix = new Personaje();
        bellatrix.setNombre("Bellatrix Lestrange (Antes Black)");
        bellatrix. setGenero("Femenino");
        bellatrix.setCasa("Slytherin");
        bellatrix.setPatronus("Sin Patronus");
        bellatrix.setBoggart("Muerte de Voldemort");

        String msg = "Nombre: " +bellatrix.getNombre();
        msg += "\nGenero: " +bellatrix.getGenero();
        msg += "\nCasa: " +bellatrix.getCasa();
        msg += "\nPatronus: " +bellatrix.getPatronus();
        msg += "\nBoggart: " +bellatrix.getBoggart();
        msg += "\n";

        System.out.println(msg);
    }

    public static void wizard5() {
        Personaje hermione = new Personaje();
        hermione.setNombre("Hermione Jean Granger");
        hermione.setGenero("Femenino");
        hermione.setCasa("Gryffindor");
        hermione.setPatronus("Nutria");
        hermione.setBoggart("El Fracaso");

        String msg = "Nombre: " +hermione.getNombre();
        msg += "\nGenero: " +hermione.getGenero();
        msg += "\nCasa: " +hermione.getCasa();
        msg += "\nPatronus: " +hermione.getPatronus();
        msg += "\nBoggart: " +hermione.getBoggart();

        System.out.println(msg);
    }
}
