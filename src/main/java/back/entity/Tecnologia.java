
package back.entity;

//import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;


@Entity
public class Tecnologia {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTec;
    @Basic
    private String nombre;
    private int nivel;
//    @ManyToOne(fetch=FetchType.LAZY)
//    @JoinColumn(name="idPerfil")
//    @JsonBackReference
//    private MiPerfil perfil;
    
    public Tecnologia(){
        
    }

    public Tecnologia(int idTec, String nombre, int nivel) {
        this.idTec = idTec;
        this.nombre = nombre;
        this.nivel = nivel;
//        this.perfil = persona;
    }

    public int getIdTec() {
        return idTec;
    }

    public void setIdTec(int idTec) {
        this.idTec = idTec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

//    public MiPerfil getPerfil() {
//        return perfil;
//    }
//
//    public void setPerfil(MiPerfil perfil) {
//        this.perfil = perfil;
//    }
    
}
