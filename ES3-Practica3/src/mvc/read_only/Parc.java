package mvc.read_only;

public class Parc {

    public Parc() {
        // Constructor logic if needed
    }

    int biodiversitat;


    public int getBiodiversitat() {
        return biodiversitat;
    }

    public void afegir(String animal){
        // Logic to add biodiversity
        biodiversitat++;
    }
    
}
