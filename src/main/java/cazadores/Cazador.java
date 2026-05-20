package cazadores;

import java.util.List;
import ar.edu.unahur.obj2.profugos.IProfugo;
import zonas.Zona;

abstract public class Cazador {
    private Double experiencia;
    private List<IProfugo> capturados;
    private List<IProfugo> intimidados;

    public void cazaGeneralEn(Zona zona) {
        for (IProfugo profugo : zona.getProfugos()) {
            if (this.experiencia > profugo.getInocencia() && condicionEspecifica(profugo)) {
                capturados.add(profugo);
                zona.removerProfugo(profugo);
                this.setExperiencia();
            } else {
                this.intimidar(profugo);
            }
        }
    }
    
    abstract public Boolean condicionEspecifica(IProfugo profugo);

    public void intimidar(IProfugo profugo) {
        profugo.disminuirInocencia();
        this.intimidacionEspecifica(profugo);
    }

    abstract public void intimidacionEspecifica(IProfugo profugo);

    public void setExperiencia() {
        if (!this.intimidados.isEmpty()) {
            this.experiencia += 
            (intimidados.stream().mapToDouble(IProfugo::getHabilidad).min().getAsDouble()) +
            (capturados.size() * 2);
        }
    }
}