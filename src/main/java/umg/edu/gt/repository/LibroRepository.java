package umg.edu.gt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umg.edu.gt.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

}
