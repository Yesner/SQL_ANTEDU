package ANT_EDU.LondonHotel.CursoSQL.controller;

import ANT_EDU.LondonHotel.CursoSQL.persistence.entity.EmployeeLandon;
import ANT_EDU.LondonHotel.CursoSQL.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<EmployeeLandon>> getAll()
    {
        return ResponseEntity.ok(employeeService.getAll());
    }

    @PostMapping
    public ResponseEntity<EmployeeLandon> create(@RequestBody EmployeeLandon employeeLandon)
    {
        return ResponseEntity.ok(this.employeeService.save(employeeLandon));
    }

    @DeleteMapping("/{EmployeeId}")
    public ResponseEntity<Void> delete(@PathVariable int EmployeeId)
    {
        this.employeeService.delete(EmployeeId);
        return ResponseEntity.ok().build();
    }

}
