public class Saint extends OctoCat{
    String nombre = "Saint Nictocat";
    String ropa = "Rojo";
    String campana = "Amarilla";
    int bolsa = 1;

    void show(){
        super.show();
        System.out.println("El nombre de este Octocat es: "+nombre);
        System.out.println("Viste con rop de color: "+ropa);
        System.out.println("Utiliza "+bolsa+" campana de color: "+campana);
        System.out.println("Lleva cargando "+bolsa+" bolsa de juguetes");
        System.out.println("");
    }
}
