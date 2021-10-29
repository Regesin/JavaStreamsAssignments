package StreamsApp;

import java.util.*;
import java.util.stream.Collectors;


/**
 * The type Employee main.
 */
public class EmployeeMain {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        //Creating Employees Objects and storing the values manually
        Employee e1 = new Employee(2, "Arun", "Hyderabad");
        Employee e2 = new Employee(1, "John", "Chennai");
        Employee e3 = new Employee(4, "Sumanth", "Bengaluru");
        Employee e4 = new Employee(3, "Sandeep", "Mumbai");
        Employee e5 = new Employee(5, "Kevin", "Kolkata");

        List<Employee> empLst = Arrays.asList(e1, e2, e3, e4, e5); // Converting employee objects into list of array
        //Printing all the employees in the List
        System.out.println();
        System.out.println("Printing the Employee details before sorting");
        for (Employee e: empLst) {
            System.out.println(e);
        }
        //Printing all the employees based on city
        System.out.println();
        System.out.println("Sorting the list based on City");
        List<Employee> citylist = empLst.stream()
                .sorted(Comparator.comparing(Employee::getCity))
                .collect(Collectors.toList());
        for (Employee e:citylist) {
            System.out.println(e);
        }
        //Printing all the employees after sorting using lamda function
        empLst.sort((Employee emp1, Employee emp2) -> emp1.getName().compareTo(emp2.getName()));
        System.out.println();

        System.out.println("After Sorting the empList based on Name");
        for (Employee e: empLst) {
            System.out.println(e);
        }
        //Printing the Employee with id = 3
        System.out.println();
        System.out.println("Employee id = 3");
        try {
            System.out.println(empLst.stream().filter(e -> e.getEmpolyeeId() == 3)
                    .findFirst()
                    .orElseThrow(() -> new EmployeeIdNotFound("Not Found")));
        }catch (Exception e){
            System.out.println(e);
        }


        //Printing all the Employees name starts with letter "K"
        System.out.println();
        System.out.println("Starts with K");
         empLst.stream().
                filter(e -> e.getName().startsWith("K"))
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
