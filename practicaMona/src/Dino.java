public class Dino extends OctoCat{
    String nombre = "Dinotocat";
    String disfraz = "Verde de dinosaurio";
    String cuernos = "Azul";
    String carrito = "Rojo";

    void show(){
        super.show();
        System.out.println("El nombre de este Octocat es: "+nombre);
        System.out.println("Octocat lleva un disfraz: "+disfraz);
        System.out.println("El disfraz lleva unos cuernos de color: "+cuernos);
        System.out.println("Va a pisar un carrito de color: "+carrito);
        System.out.println("");
    }
}
