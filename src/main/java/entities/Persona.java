package entities;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Persona {
    
    private String codigo;
    private String nombrePersona;

    public Persona() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    
    
    
}
