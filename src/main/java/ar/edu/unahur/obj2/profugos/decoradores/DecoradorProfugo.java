package ar.edu.unahur.obj2.profugos.decoradores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public abstract class DecoradorProfugo implements IProfugo{
    private final IProfugo profugo;
    
    public DecoradorProfugo(IProfugo profugo) {
        this.profugo = profugo;
    }

    public abstract void entrenar();

    @Override
    public void dejarDeEstarNervioso() {
        profugo.dejarDeEstarNervioso();
        
    }

    @Override
    public void disminuirInocencia() {
        profugo.disminuirInocencia();
        
    }

    @Override
    public Boolean esNervioso() {
        return profugo.esNervioso();
    }

    @Override
    public Integer getHabilidad() {
        return profugo.getHabilidad();
    }

    @Override
    public Integer getInocencia() {
        return profugo.getInocencia();
    }

    @Override
    public void reducirHabilidad() {
        profugo.reducirHabilidad();
    }

    @Override
    public void volverseNervioso() {
        profugo.volverseNervioso();
    }

    @Override
    public void setHabilidad(Integer habilidad) {
        profugo.setHabilidad(habilidad);
        
    }

    @Override
    public void setInocencia(Integer inocencia) {
        profugo.setInocencia(inocencia);
        
    }
}
