
package back.repository;

import back.entity.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TecnologiaRepository extends JpaRepository <Tecnologia,Integer>{
    
}
