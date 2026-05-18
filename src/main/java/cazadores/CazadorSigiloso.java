package cazadores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class CazadorSigiloso extends Cazador {

  @Override
  public Boolean condicionEspecifica(IProfugo profugo) {
    if (profugo.getHabilidad() < 50) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void intimidacionEspecifica(IProfugo profugo) {
    profugo.reducirHabilidad();
  }
    
}
