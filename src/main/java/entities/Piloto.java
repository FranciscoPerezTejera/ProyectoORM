package entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "PILOTOS")
public class Piloto extends Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "hora_de_vuelo")
    private int horaDeVuelo;
    @OneToMany(mappedBy = "piloto", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Set<Vuelo> vuelos;

    public Piloto() {
        
    }
    
    @Override
    public void setNombrePersona(String nombrePersona) {
        super.setNombrePersona(nombrePersona);
    }

    @Override
    public String getNombrePersona() {
        return super.getNombrePersona();
    }

    @Override
    public void setCodigo(String codigo) {
        super.setCodigo(codigo);
    }

    @Override
    public String getCodigo() {
        return super.getCodigo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHoraDeVuelo() {
        return horaDeVuelo;
    }

    public void setHoraDeVuelo(int horaDeVuelo) {
        this.horaDeVuelo = horaDeVuelo;
    }

    public Set<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(Set<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    @Override
    public String toString() {
        return " ID del miembro = " + id 
                + "\n Código = " + this.getCodigo() 
                + "\n Nombre: " + this.getNombrePersona();
    }  
}
