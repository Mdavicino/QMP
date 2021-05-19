package uniforme;

import prenda.*;

public class SastreJohnston implements Sastre {
  PrendaBorrador borrador;

  @Override
  public Prenda fabricarParteSuperior() throws Exception {
    borrador = new PrendaBorrador(new TipoDePrenda(Categoria.SUPERIOR, "Chomba"));
    borrador.especificarColor(new Color(0, 100, 10));
    borrador.especificarMaterial(Material.PIQUE);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarParteInferior() throws Exception {
    borrador = new PrendaBorrador(new TipoDePrenda(Categoria.INFERIOR, "Pantalón"));
    borrador.especificarColor(new Color(1, 2, 3));
    borrador.especificarMaterial(Material.ACETATO);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarCalzado() throws Exception {
    borrador = new PrendaBorrador(new TipoDePrenda(Categoria.CALZADO, "Zapato"));
    borrador.especificarColor(new Color(1, 2, 3));
    borrador.especificarMaterial(Material.CUERO);
    return borrador.crearPrenda();
  }
}
