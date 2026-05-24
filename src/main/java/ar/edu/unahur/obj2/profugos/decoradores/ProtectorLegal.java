package ar.edu.unahur.obj2.profugos.decoradores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class ProtectorLegal extends DecoradorProfugo {

    public ProtectorLegal(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public void entrenar() {
        if (this.getInocencia() < 40) {
            this.setInocencia(40);
        }
    }
}
