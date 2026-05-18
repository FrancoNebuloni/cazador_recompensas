package cazadores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class CazadorRural extends Cazador {

    @Override
    public Boolean condicionEspecifica(IProfugo profugo) {
        if (profugo.esNervioso()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void intimidacionEspecifica(IProfugo profugo) {
        profugo.volverseNervioso();
    }
}
