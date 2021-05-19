package prenda;

public class Prenda {
  TipoDePrenda tipoDePrenda;
  Material material;
  Trama trama;
  Color colorPrimario;
  Color colorSecundario;
  double temperaturaMaxima;

  public Prenda(TipoDePrenda tipoDePrenda, Material material, Trama trama, Color colorPrimario, Color colorSecundario, double temperaturaMaxima) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public Prenda(TipoDePrenda tipoDePrenda, Material material, Trama trama, Color colorPrimario, double temperaturaMaxima) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrimario = colorPrimario;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public boolean esAcordePara(int temperatura) {
    return  temperaturaMaxima >= temperatura;
  }
}







