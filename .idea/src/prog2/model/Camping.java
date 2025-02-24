package prog2.model;
import java.time.LocalDate;
import java.util.*;
import prog2.vista.*;

public class Camping {

    private String nom;
    private ArrayList<Allotjament> allotjaments;
    private ArrayList<Reserva> reserves;
    private ArrayList<Client> clients;

    public Camping (String nom) {
        this.nom = nom;
        this.allotjaments = new ArrayList<>();
        this.reserves = new ArrayList<>();
        this.clients = new ArrayList<>();
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


    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {

    }


    public float calculMidaTotalParceles() {
        return 0;
    }


    public int calculAllotjamentsOperatius() {
        return 0;
    }


    public Allotjament getAllotjamentEstadaMesCurta() {
        return null;
    }


    public String getNom() {
        return "";
    }


    public LlistaReserves getLlistaReserves() {
        return new LlistaReserves(this.reserves);
    }


    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return null;
    }


    public ArrayList<Client> getLlistaClients() {
        return null;
    }


    public int getNumAllotjaments() {
        return 0;
    }


    public int getNumReserves() {
        return 0;
    }


    public int getNumClients() {
        return 0;
    }

    public void afegirClient(String nomClient, String dni) throws ExcepcioReserva {
    }

}
