package prog2.model;
import prog2.model.*;

public abstract class Allotjament {

    private String nom;
    private String idAllotjament;
    private static long estadaMinimaALTA;
    private static long estadaMinimaBAIXA;

    public Allotjament(String nom, String idAllotjament) {
        this.nom = nom;
        this.idAllotjament = idAllotjament;
    }

    // Implementació de la interfície

    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getId() {
        return idAllotjament;
    }


    public void setId(String idAllotjament) {
        this.idAllotjament = idAllotjament;
    }


    enum Temp {
        ALTA,
        BAIXA
    }

    public long getEstadaMinima(Temp temp) {
        switch (temp) {
            case ALTA:
                return estadaMinimaALTA;
            case BAIXA:
                return estadaMinimaBAIXA;
            default:
                throw new IllegalArgumentException("Temporada no vàlida");
        }
    }


    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {
        estadaMinimaALTA = estadaMinimaALTA_;
        estadaMinimaBAIXA = estadaMinimaBAIXA_;
    }

    // Aquest mètode és abstracte perquè cada subclasse el definirà a la seva manera.

    public boolean correcteFuncionament() {
        return false;
    }
}
