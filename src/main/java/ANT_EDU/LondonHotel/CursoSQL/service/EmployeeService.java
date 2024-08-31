package ANT_EDU.LondonHotel.CursoSQL.service;


import ANT_EDU.LondonHotel.CursoSQL.persistence.entity.EmployeeLandon;
import ANT_EDU.LondonHotel.CursoSQL.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // voy a consultar todos los regitros
    public List<EmployeeLandon> getAll()
    {
        return this.employeeRepository.findAll();
    }

    // Guardar
    public EmployeeLandon save(EmployeeLandon employeeLandon)
    {
        return this.employeeRepository.save(employeeLandon);
    }

    // Borrar

    public void delete(int EmployeeId)
    {
        this.employeeRepository.deleteById(EmployeeId);
    }


}
