public class Boxer extends OctoCat{
    String nombre = "Boxertocat";
    String banda = "Rojo";
    int guantes = 3;

    void show(){
        super.show();
        System.out.println("El nombre de este Octocat es: "+nombre);
        System.out.println("Tiene una banda de color: "+banda);
        System.out.println("Utiliza "+guantes+" guantes de color "+banda);
        System.out.println("");
    }
}
