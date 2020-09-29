
package DTO;

import java.util.Date;

public class DTOTipoInstancia {
    
    private int codTipoInstancia;    
    private String nombreTipoInstancia;    
    private Date fechaHoraFinVigenciaTI;
    private int codSector;
    private String nombreSector;
    private int codTipoTarea;
    private String nombreTipoTarea;
//En el DTO declaramos los atributos de sector o solamente utilizamos sus dtos
   
    
    //Setters and getters
    public Date getFechaHoraFinVigenciaTI() {
        return fechaHoraFinVigenciaTI;
    }
  
    public void setFechaHoraFinVigenciaTI(Date fechaHoraFinVigenciaTI) {
        this.fechaHoraFinVigenciaTI = fechaHoraFinVigenciaTI;
    }

    public String getNombreTipoInstancia() {
        return nombreTipoInstancia;
    }

    public void setNombreTipoInstancia(String nombreTipoInstancia) {
        this.nombreTipoInstancia = nombreTipoInstancia;
    }

    public int getCodTipoInstancia() {
        return codTipoInstancia;
    }

    public void setCodTipoInstancia(int codTipoInstancia) {
        this.codTipoInstancia = codTipoInstancia;
    }

    public int getCodSector() {
        return codSector;
    }

    public void setCodSector(int codSector) {
        this.codSector = codSector;
    }

    public String getNombreSector() {
        return nombreSector;
    }

    public void setNombreSector(String nombreSector) {
        this.nombreSector = nombreSector;
    }

    public int getCodTipoTarea() {
        return codTipoTarea;
    }

    public void setCodTipoTarea(int codTipoTarea) {
        this.codTipoTarea = codTipoTarea;
    }

    public String getNombreTipoTarea() {
        return nombreTipoTarea;
    }

    public void setNombreTipoTarea(String nombreTipoTarea) {
        this.nombreTipoTarea = nombreTipoTarea;
    }
    

}
