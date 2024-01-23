package entities;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Persona {
    
    private int codigo;
    private String nombrePersona;

    public Persona() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    
    
    
}
