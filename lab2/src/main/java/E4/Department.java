package E4;
import java.util.*;

public class Department {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + '}';
    }
    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
      
    
    public void addEmployee(Employee b) {
            employees.add(b);
            b.setDepartment(null);
        }

    public void removeBook(Employee b) {
            employees.remove(b);
            b.setDepartment(null);
        }
}
