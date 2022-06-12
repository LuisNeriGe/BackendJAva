public class Jet extends OctoCat{
    String nombre = "Jetpacktocat";
    String chaleco = "Naranja";
    String jet = "Amarillo";
    int prop = 2;

    void show(){
        super.show();
        System.out.println("El nombre de este Octocat es: "+nombre);
        System.out.println("Lleva un chaleco de color: "+chaleco);
        System.out.println("El jetpack es de color: "+jet);
        System.out.println("El jetpack tiene "+prop+" propulsores");
    }
}
