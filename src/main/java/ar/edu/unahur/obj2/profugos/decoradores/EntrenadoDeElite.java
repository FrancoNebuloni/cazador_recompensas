package ar.edu.unahur.obj2.profugos.decoradores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class EntrenadoDeElite extends DecoradorProfugo {

    public EntrenadoDeElite(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public void entrenar() {
        if (this.esNervioso()) {
            this.dejarDeEstarNervioso();
        }
    }

}
