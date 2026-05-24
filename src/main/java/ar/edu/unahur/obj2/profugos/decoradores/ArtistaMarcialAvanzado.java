package ar.edu.unahur.obj2.profugos.decoradores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class ArtistaMarcialAvanzado extends DecoradorProfugo {

    public ArtistaMarcialAvanzado(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public void entrenar() {
        if (this.getHabilidad() < 100) {
            this.setHabilidad(getHabilidad() * 2);
        }
    }

}
