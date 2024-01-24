package entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Date;

@Entity
@Table (name = "VUELOS")
public class Vuelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "numero_vuelo")
    private int num_vuelo;
    @Column (name = "origen_vuelo")
    private String origen;
    @Column (name = "destino_vuelo")
    private String destino;
    @Column (name = "hora_vuelo")
    private String hora;
    @Column (name = "fecha_vuelo")
    private Date fecha;
    @ManyToOne()
    @JoinColumn(name = "id_piloto")
    private Piloto piloto;
    @ManyToOne()
    @JoinColumn(name = "id_miembro")
    private Miembro miembro;
    

    public Vuelo() {
    }

    public int getNum_vuelo() {
        return num_vuelo;
    }

    public void setNum_vuelo(int num_vuelo) {
        this.num_vuelo = num_vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "id=" + id + ", num_vuelo=" + num_vuelo + ", origen=" + origen + ", destino=" + destino + ", hora=" + hora + ", fecha=" + fecha + ", piloto=" + piloto + ", miembro=" + miembro + '}';
    }
    
    
    
}
