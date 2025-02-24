package prog2.model;

public class Allotjament {
    private String nom;
    private String idAllotjament;
    private long estadaMinimaALTA;
    private long estadaMinimaBAIXA;

    // Constructor
    public Allotjament(String nom, String id, long estadaMinimaALTA, long estadaMinimaBAIXA) {
        this.nom = nom;
        this.idAllotjament = idAllotjament;
        this.estadaMinimaALTA = estadaMinimaALTA;
        this.estadaMinimaBAIXA = estadaMinimaBAIXA;
    }

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

