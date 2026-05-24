package ar.edu.unahur.obj2.profugos;

public class Profugo implements IProfugo {

    private Integer inocencia;
    private Integer habilidad;
    private Boolean nervioso;

    public Profugo(Integer inocencia, Integer habilidad, Boolean nervioso) {
        this.inocencia = inocencia;
        this.habilidad = habilidad;
        this.nervioso = nervioso;
    }

    @Override
    public Integer getInocencia() {
        return inocencia;
    }

    @Override
    public Integer getHabilidad() {
        return habilidad;
    }

    @Override
    public Boolean esNervioso() {
        return nervioso;
    }

    @Override
    public void volverseNervioso() {
        nervioso = true;
    }

    @Override
    public void dejarDeEstarNervioso() {
        nervioso = false;
    }

    @Override
    public void reducirHabilidad() {
        habilidad = Math.max(0, habilidad - 5);
    }

    @Override
    public void disminuirInocencia() {
        inocencia = Math.max(0, inocencia - 2);
    }

    public void setInocencia(Integer inocencia) {
        this.inocencia = inocencia;
    }

    public void setHabilidad(Integer habilidad) {
        this.habilidad = habilidad;
    }
    
}
