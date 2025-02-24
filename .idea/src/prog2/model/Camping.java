package prog2.model;
import java.time.LocalDate;
import java.util.*;
import prog2.vista.*;
import prog2.model.*;


public class Camping  implements InCamping{

    private String nom;
    private ArrayList<Allotjament> allotjaments;
    private ArrayList<Reserva> reserves;
    private ArrayList<Client> clients;

    public Camping () {
        this.nom = "Camping del mar";
        this.allotjaments = new ArrayList<>();
        this.reserves = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    private String idAllotjament, mida, nomClient, dni, codiWifi, material;
    private float metres;
    private int habitacions, placesPersones, placesParquing;
    private boolean connexioElectrica, terrassa, tv, aireFred, serveisExtra, casaMascota, terrassaBarbacoa;

    public String getNom(){
        return this.nom;
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

    /** Acabar, dona errors:
    public static Allotjament.Temp getTemporada(LocalDate data) {
        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();
        Allotjament.getEstadaMinima()
        // Temporada ALTA: 21 març - 20 setembre

        if ((mes > 3 && mes < 9) || (mes == 3 && dia >= 21) || (mes == 9 && dia <= 20)) {

        }
            return Allotjament.Temp.ALTA;
        }
        // Temporada BAIXA: 21 setembre - 20 març
        else {
            return Allotjament.Temp.BAIXA;
        }
     **/
}
