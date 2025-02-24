package prog2.model;
import java.util.*;
import prog2.vista.*;

public class Camping {

    private String nom;

    public Camping (String name) {
        this.nom = name;
    }

    private String idAllotjament, mida, nomClient, dni, codiWifi, material;
    private float metres;
    private int habitacions, placesPersones, placesParquing;
    private boolean connexioElectrica, terrassa, tv, aireFred, serveisExtra, casaMascota, terrassaBarbacoa;

    public String getNom(String nom){
        return nom;
    }


    public void afegirParcela(String nom, String idAllotjament, float metres, boolean connexioElectrica) {
    }

    public void afegirBungalow(String nom, String idAllotjament, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
    }

    public void afegirBungalowPremium(String nom, String idAllotjament, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
    }

    public void afegirGlamping(String nom, String idAllotjament, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {
    }

    public void afegirMobilHome(String nom, String idAllotjament, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
    }

    public void afegirClient(String nomClient, String dni) throws ExcepcioReserva {
    }

}
