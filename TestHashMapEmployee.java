package HashMapEmployees;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMapEmployee {
    public static void main(String[] args) {

        HashMap<Employee,Integer> testMap = new HashMap<>();

        Employee Emp1 = new Employee("Gwen","70000");
        Employee Emp2 = new Employee("Michael","80000");
        Employee Emp3 = new Employee("Samson","90000");


        testMap.put(Emp1,70000);
        testMap.put(Emp2,80000);
        testMap.put(Emp3,90000);

        Iterator mapIterator = testMap.keySet().iterator();
        while(mapIterator.hasNext()){
            Employee key = (Employee)mapIterator.next();
            Integer value = testMap.get(key);

            System.out.println("The Employee is "+key.getEmployeeName()+" and the salary "+ value);

        }

        Employee EmpG = new Employee("Gwen","70000");

        Integer sal = testMap.get(EmpG);
        System.out.println("The Employee is "+EmpG.getEmployeeName()+ " and -the salary is "+ sal);


    }
}
