package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;

@Entity
@Table (name = "MIEMBROS")
public class Miembro extends Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy = "miembro")
    private Set <Vuelo> vuelos;

    @Override
    public void setNombrePersona(String nombrePersona) {
        super.setNombrePersona(nombrePersona); 
    }
    @Override
    public String getNombrePersona() {
        return super.getNombrePersona();
    }

    @Override
    public void setCodigo(int codigo) {
        super.setCodigo(codigo);
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                + "\n Nombre: " + this.getNombrePersona()
                + "\n Vuelos: " + this.getVuelos();
    }
    
    
    
}
