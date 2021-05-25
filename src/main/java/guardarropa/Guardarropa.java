package guardarropa;

import exceptions.PrendaNoExistenteEnGuardarropasException;
import exceptions.PrendaYaIncluidaEnGuardarropasException;
import prenda.Prenda;
import prenda.PrendaSugerencia;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Guardarropa {
  public List<Prenda> prendas;
  public List<PrendaSugerencia> prendasSugeridasParaAgregar;
  public List<PrendaSugerencia> prendasSugeridasParaEliminar;
  public List<Persona> duenios;

  public Guardarropa(List<Prenda> prendas, List<Persona> duenios) {
    this.prendas = prendas;
    this.duenios = duenios;
  }

  public List<PrendaSugerencia> getPrendasSugeridasParaAgregar() {
    return prendasSugeridasParaAgregar;
  }

  public List<PrendaSugerencia> getPrendasSugeridasParaEliminar() {
    return prendasSugeridasParaEliminar;
  }

  public List<Prenda> prendasEliminadas(){
    return prendasSugeridasParaEliminar.stream().filter(prenda -> prenda.isAceptada()).map(prenda -> prenda.getPrenda()).collect(Collectors.toList());
  }

  public List<Prenda> prendasAgregadas(){
    return prendasSugeridasParaAgregar.stream().filter(prenda -> prenda.isAceptada()).map(prenda -> prenda.getPrenda()).collect(Collectors.toList());
  }

  public List<Prenda> getPrendas() {
    List <Prenda> prendasFinales = prendas.stream().filter(prenda -> prenda != prendasEliminadas().iterator()).collect(Collectors.toList());
    return Stream.concat(prendasFinales.stream(), prendasAgregadas().stream()).collect(Collectors.toList());
  }

  public void sugerirAgregarPrenda(PrendaSugerencia unaPrenda){
    if(prendas.contains(unaPrenda.getPrenda())){
      throw new PrendaYaIncluidaEnGuardarropasException();
    }
    prendasSugeridasParaAgregar.add(unaPrenda);
  }

  public void sugerirEliminarPrenda(PrendaSugerencia unaPrenda){
    if(!prendas.contains(unaPrenda.getPrenda())){
      throw new PrendaNoExistenteEnGuardarropasException();
    }
    prendasSugeridasParaEliminar.add(unaPrenda);
  }

  public void aceptarPropuesta(PrendaSugerencia unaPrendaSugerida){
    unaPrendaSugerida.setAceptada(true);
  }

  public void rechazarPropuesta(PrendaSugerencia unaPrendaSugerida){
    unaPrendaSugerida.setAceptada(false);
  }
}
