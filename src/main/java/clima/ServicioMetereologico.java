package clima;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicioMetereologico {
  private API api;

  public ServicioMetereologico(API api) {
    this.api = api;
  }

  public Map<String, Object> obtenerClima(String direccion){
    return api.getWeather(direccion).get(0);
  }

}
