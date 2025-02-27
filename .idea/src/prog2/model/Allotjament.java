package prog2.model;

public abstract class Allotjament implements InAllotjament{
     String nom;
     String idAllotjament;
     static long estadaMinimaALTA;
     static long estadaMinimaBAIXA;

    // Constructor
    public Allotjament(String nom, String idAllotjament, long estadaMinimaALTA, long estadaMinimaBAIXA) {
        this.nom = nom;
        this.idAllotjament = idAllotjament;  // Canviat a `idAllotjament` per corregir l'error
        this.estadaMinimaALTA = estadaMinimaALTA;
        this.estadaMinimaBAIXA = estadaMinimaBAIXA;
    }
    public enum Temp {ALTA, BAIXA};


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

    @Override
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {

    }


    public long getEstadaMinima(prog2.model.InAllotjament.Temp temp) {
        return 0;
    }


    public static long getEstadaMinima(Temp temp) {
        switch (temp) {
            case ALTA:
                return estadaMinimaALTA;
            case BAIXA:
                return estadaMinimaBAIXA;
            default:
                throw new IllegalArgumentException("Temporada no válida: " + temp);
        }
    }

    public void setEstadaMinima(Temp temp, long estadaMinima) {
        switch (temp) {
            case ALTA:
                estadaMinimaALTA = estadaMinima;
                break;
            case BAIXA:
                estadaMinimaBAIXA = estadaMinima;
                break;
            default:

        }
    }
    public boolean correcteFuncionament() {

        return false;
    }
}
