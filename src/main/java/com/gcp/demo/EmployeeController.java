package com.gcp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    @GetMapping
    public String info() {
        return "Hello from my VM";
    }
    @GetMapping("/about")
    public String about() {
        return "Cloud Run demo !";
    }

    @Autowired
    private EmployeeRepository employeeRepository;
    @PostMapping
    public Employee registerEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
