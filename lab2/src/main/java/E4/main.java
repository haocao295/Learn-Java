
package E4;
import java.util.*;

public class main {

    public static void main(String[] args) {
        List<Department> departments = new ArrayList<>();
        Department dansu, taichinh, kinhdoanh;
        
        dansu = new Department(1,"dan su");
        dansu.addEmployee(new Employee(1,"Nguyen Van A",1000000));
        dansu.addEmployee(new Employee(2,"Nguyen Van B",2000000));
        
        taichinh = new Department(2,"tai chinh");
        taichinh.addEmployee(new Employee(3,"Nguyen Thi A",1000000));
        taichinh.addEmployee(new Employee(4,"Nguyen Thi B",2000000));
        
        kinhdoanh = new Department(3,"kinh doanh");
        kinhdoanh.addEmployee(new Employee(5,"Nguyen Van C",1000000));
        kinhdoanh.addEmployee(new Employee(6,"Nguyen Van D",2000000));
        
        departments.add(dansu);
        departments.add(taichinh);
        departments.add(kinhdoanh);
       
        for(Department department:departments){
           System.out.println("\n" + department);
           for(Employee b:department.getEmployees()){
                System.out.println(b); 
            }   
        }
    }
}
