import java.security.Key;
import java.util.*;

public class DemoCollectionFramework {
    public static void main(String[] args){
        //Map
        Map<Integer , Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee("f1","l1"));
        employeeMap.put(2, new Employee("f2","l2"));
        employeeMap.put(22, new Employee("f22","l22"));

        Employee employee = employeeMap.get(22);
        System.out.println(employee.getFullName());

        //Iterate
        Set<Integer> Keys = employeeMap.keySet();
        for (Integer Key : Keys){
            Employee e = employeeMap.get(Key);
            System.out.println("Data =>" + e.getFullName());
        }

        //List
        List<String> users = new ArrayList<>();
        users.add("Mookki");
        users.add("123");

        for (String user:users){
            System.out.println(user);
        }

        for (int i = 0;i < users.size() ; i++){
            System.out.println(users.get(i));
        }

    }
}
