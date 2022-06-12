public class OctoManufacture extends OctoCat{
    String nombre = "Manufacturetocat";
    String casco = "Amarillo";
    String ropa = "Azul";
    String lentes = "Azul";
    int zapatos = 2;

    void show(){
        super.show();
        System.out.println("El nombre de este Octocat es: "+nombre);
        System.out.println("El casco de "+nombre+" es de color: "+casco);
        System.out.println("La ropa de "+nombre+" es de color: "+ropa);
        System.out.println("Los lentes de "+nombre+" son de color: "+lentes);
        System.out.println(nombre+" utiliza: "+zapatos+" zapatos");
        System.out.println("");
    }
}
