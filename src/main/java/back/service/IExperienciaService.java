
package back.service;

import back.entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencias();
    public void agregarExperiencia(Experiencia exp);
    public void borrarExperiencia(int id);
    public Experiencia buscarExperiencia(int id);
    public void editarExperiencia(Experiencia exp);
}
