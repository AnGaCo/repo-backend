
package back.entity;

//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.*;


@Entity
public class MiPerfil {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPerfil;
    @Basic
    private String nombre;
    private String apellido;
    private String profesion;
    private String resumen;
    private String foto;
    private String email;
    private String domicilio;
    private String telefono;
    
//    @OneToMany(mappedBy="perfil",cascade= {CascadeType.ALL})
//    @JsonIgnore
//    private List<Estudio> estudios;
//    
//    @OneToMany(mappedBy="perfil",cascade=CascadeType.ALL)
//    @JsonIgnore
//    private List<Experiencia> experiencias;
//    
//    @OneToMany(mappedBy="perfil",cascade={CascadeType.ALL})
//    @JsonIgnore
//    private List<Proyecto> proyectos;
//    
//    @OneToMany(mappedBy="perfil", cascade={CascadeType.ALL})
//    @JsonIgnore
//    private List<Tecnologia> tecnologias;
    
    public MiPerfil(){
        super();
    }

    public MiPerfil(int idPerfil, String nombre, String apellido, String profesion, String resumen, String foto, String email, String domicilio, String telefono) {
        this.idPerfil = idPerfil;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.resumen = resumen;
        this.foto = foto;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

//    public List<Estudio> getEstudios() {
//        return estudios;
//    }
//
//    public void setEstudios(List<Estudio> estudios) {
//        this.estudios = estudios;
//    }
//
//    public List<Experiencia> getExperiencias() {
//        return experiencias;
//    }
//
//    public void setExperiencias(List<Experiencia> experiencias) {
//        this.experiencias = experiencias;
//    }
//
//    public List<Proyecto> getProyectos() {
//        return proyectos;
//    }
//
//    public void setProyectos(List<Proyecto> proyectos) {
//        this.proyectos = proyectos;
//    }
//
//    public List<Tecnologia> getTecnologias() {
//        return tecnologias;
//    }
//
//    public void setTecnologias(List<Tecnologia> tecnologias) {
//        this.tecnologias = tecnologias;
//    }
    
}
