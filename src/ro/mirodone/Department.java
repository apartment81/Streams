package ro.mirodone;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Employee> employees;

     Department(String name){
        this.name = name;
        employees = new ArrayList<>();
    }

public void addEmployee (Employee employee){
        employees.add(employee);
}

    public List<Employee> getEmployees() {
        return employees;
    }
}
