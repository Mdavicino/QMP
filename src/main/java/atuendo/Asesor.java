package atuendo;

import clima.API;
import clima.ServicioMetereologico;
import prenda.Prenda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Asesor {

  ServicioMetereologico servicioMetereologico;

  public Asesor(ServicioMetereologico servicioMetereologico) {
    this.servicioMetereologico = servicioMetereologico;
  }

  public List<Atuendo> darSugerencia(List<Prenda> armario, String ciudad){
    Map<String, Object> climaActual = servicioMetereologico.obtenerClima(ciudad);
    HashMap<String, Object> temp = (HashMap<String, Object>) climaActual.get("Temperature");
    int temperatura = (int) temp.get("Value");
    List<Atuendo> atuendosPosibles = getAtuendosPosibles(armario);
    return atuendosPosibles.stream().filter(atuendo -> atuendo.esAptoPara(temperatura)).collect(Collectors.toList());
  }

  public List<Atuendo> getAtuendosPosibles(List<Prenda> unasPrendas){
    return null;// Combinaciones de todas las prendas según su categoría
  }



}
