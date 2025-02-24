package prog2.model;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import prog2.vista.ExcepcioReserva;

public class LlistaReserves {
    private List<Object[]> reserves = new ArrayList<>();


    public LlistaReserves(ArrayList<Reserva> reserves) {
        this.reserves = new ArrayList<>();
    }

    public LlistaReserves(ArrayList<Reserva> reserves) {
        this.reserves = new ArrayList<>();
    }


    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        reserves.add(new Object[]{allotjament, client, dataEntrada, dataSortida});
    }



    public int getNumReserves() {
        return reserves.size();
    }
}

