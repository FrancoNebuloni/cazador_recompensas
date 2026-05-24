package ar.edu.unahur.obj2.profugos;

public interface IProfugo {
    Integer getInocencia();

    Integer getHabilidad();

    Boolean esNervioso();

    void volverseNervioso();

    void dejarDeEstarNervioso();

    void reducirHabilidad();

    void disminuirInocencia();

    void setInocencia(Integer inocencia);

    void setHabilidad(Integer habilidad);
}