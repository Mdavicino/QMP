package prenda;

public class PrendaSugerencia {
  private Prenda prenda;
  private boolean aceptada = false;

  public void setAceptada(boolean aceptada) {
    this.aceptada = aceptada;
  }

  public PrendaSugerencia(Prenda prenda) {
    this.prenda = prenda;
  }

  public Prenda getPrenda() {
    return prenda;
  }

  public boolean isAceptada() {
    return aceptada;
  }
}
