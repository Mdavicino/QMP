package prenda;

import java.util.Objects;

public class PrendaBorrador{
  TipoDePrenda tipoDePrenda;
  Material material;
  Color colorPrimario;
  Color colorSecundario;
  Trama trama = Trama.LISA;
  double temperaturaMaxima= 1000;

  public PrendaBorrador(TipoDePrenda tipoDePrenda) {
    this.tipoDePrenda = Objects.requireNonNull(tipoDePrenda, "tipo de prenda es obligatorio");
  }

  public PrendaBorrador especificarColor(Color colorPrimario){
    this.colorPrimario = Objects.requireNonNull(colorPrimario, "color es obligatorio");
    return this;
  }
  public PrendaBorrador especificarColorSecundario(Color colorSecundario){
    this.colorSecundario = Objects.requireNonNull(colorSecundario, "color es obligatorio");
    return this;
  }
  public PrendaBorrador especificarMaterial(Material material){
    Objects.requireNonNull(material);
    this.validarMaterialConsistenteConTipoDePrenda(material);
    this.material = material;
    return this;
  }

  public PrendaBorrador especificarTemperaturaMaxima(double temperaturaMaxima){
    this.temperaturaMaxima = Objects.requireNonNull(temperaturaMaxima, "color es obligatorio");
    return this;
  }

  private void validarMaterialConsistenteConTipoDePrenda(Material material) {
    // TODO
  }

  public void especificarTrama(Trama trama){
    if(trama != null){
      this.trama = trama;
    }
  }
  public Prenda crearPrenda() throws Exception {
    if(colorPrimario == null || material == null || temperaturaMaxima == 1000){
      throw new Exception("El color primario, el material y la temperatura máxima son obligatorios");
    }
    if(colorSecundario == null){
      return new Prenda(tipoDePrenda, material, trama, colorPrimario, temperaturaMaxima);
    }else{
      return new Prenda(tipoDePrenda, material, trama, colorPrimario, colorSecundario, temperaturaMaxima);
    }

  }
}
