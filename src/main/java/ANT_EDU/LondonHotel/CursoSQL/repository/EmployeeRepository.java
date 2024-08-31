package ANT_EDU.LondonHotel.CursoSQL.repository;

import ANT_EDU.LondonHotel.CursoSQL.persistence.entity.EmployeeLandon;
import org.springframework.data.repository.ListCrudRepository;

public interface EmployeeRepository extends ListCrudRepository<EmployeeLandon, Integer > {
}
