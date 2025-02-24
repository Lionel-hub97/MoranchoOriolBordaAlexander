package prog2.model;



import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import prog2.model.*;

public class LlistaReserves implements InLlistaReserves{
    /**
     * @param allotjament
     * @param client
     * @param dataEntrada
     * @param dataSortida
     * @throws ExcepcioReserva
     */

    /**
     *
     * Un mètode anomenat allotjamentDisponible. Aquest mètode rep com a paràmetres
     * un objecte de tipus Allotjament i dos objectes de tipus LocalDate  (les dates de
     * entrada i de sortida) i retornarà un booleà per indicar si l’allotjament passat està
     * disponible per fer la reserva en el dia indicat:
     */
    private List<Object[]> reserves = new ArrayList<>();


    public void LlistaReserves(ArrayList<Reserva> reserves) {
        this.reserves = new ArrayList<>();
    }
    /** Acabar, dona errors:
    public boolean isEstadaMinima(Allotjament tipus, LocalDate dataEntrada, LocalDate dataSortida){
        long estada = ChronoUnit.DAYS.between(dataEntrada, dataSortida);
        Camping camping = new Camping();

        Allotjament.Temp temporada = camping.getTemporada(dataEntrada);
        Allotjament allotjament = new Allotjament();

        if(estada < allotjament.getEstadaMinima(temporada) ){
            return false;
        }
        else{
            return true;
        }


    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        reserves.add(new Object[]{allotjament, client, dataEntrada, dataSortida});
    }

    /**
     * @return
     */
    @Override
    public int getNumReserves() {
        return reserves.size();
    }
}