package atuendo;

import prenda.Prenda;

public class Atuendo {
  public Prenda parteSuperior;
  public Prenda parteInferior;
  public Prenda calzado;
  public Prenda gorro;

  public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado, Prenda gorro) {
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
    this.gorro = gorro;
  }

  public boolean esAptoPara(int temperatura) {
    return parteSuperior.esAcordePara(temperatura) && parteInferior.esAcordePara(temperatura) && calzado.esAcordePara(temperatura)  && gorro.esAcordePara(temperatura);
  }
}
