package clima;

import java.util.List;
import java.util.Map;

public interface API {
  public List<Map<String, Object>> getWeather(String direccion);
}
