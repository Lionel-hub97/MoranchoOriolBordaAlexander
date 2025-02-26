package prog2.model;

public abstract class Casa extends Allotjament {

    // Constructor
    public Casa(String nom, String idAllotjament) {
        this.nom = nom;
    }

    // La clase Casa también es abstracta, por lo que no implementa el método
    @Override
    abstract boolean correcteFuncionament();
}
