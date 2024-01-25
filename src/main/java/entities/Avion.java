package entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "AVIONES")
public class Avion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "codigo_avion")
    private String codigoAvion;
    @Column (name = "tipo_avion")
    private String tipoAvion;
    @OneToOne(mappedBy = "avion", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Vuelo vuelo;

    public Avion() {
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
        public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    @Override
    public String toString() {
        return "ID del avión = " + id
                + " Código avión = " + codigoAvion
                + " Tipo de avión = " + tipoAvion;
    }
    
    
    
}
