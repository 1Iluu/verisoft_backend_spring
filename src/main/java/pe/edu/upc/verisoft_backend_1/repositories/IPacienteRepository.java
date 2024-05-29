package pe.edu.upc.verisoft_backend_1.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.verisoft_backend_1.entities.Paciente;

import java.util.List;
@Repository
public interface IPacienteRepository extends JpaRepository<Paciente,Integer> {

}
