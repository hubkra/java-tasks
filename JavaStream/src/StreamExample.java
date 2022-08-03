import java.util.*;
import java.util.stream.IntStream;


public class StreamExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alek",3500,9,Position.DEVELOPER));
        employees.add(new Employee("Paweł",2500,8,Position.MANAGER));
        employees.add(new Employee("Rafał",2500,5,Position.MANAGER));
        employees.add(new Employee("Agata",8500,10,Position.TECH_LEAD));
        employees.add(new Employee("Marcin",2200,7,Position.RECRUITER));
        employees.add(new Employee("Tomek",4000,8,Position.DEVELOPER));

        List<String> namesOfSalaryBetterThen300andIsIt = employees
                .stream()
                .filter(user -> user.getSalary() > 3000 && user.getPosition().isIt())
                .map(Employee::getName)
                .peek(s -> System.out.println("Mapped employee name: "+ s))
                .toList();

        System.out.println(namesOfSalaryBetterThen300andIsIt);

        System.out.println(" \n Druga Lista: ");

        //List not in IT && mark>7

        List<String> nameNotItWithMarkOver7 = employees
                .stream()
                .filter(empo -> !empo.getPosition().isIt())
                .filter(empo -> empo.getMark() > 5)
                .map(Employee::getName)
                .peek(empo -> System.out.println("Name: " + empo))
                .toList();

        System.out.println(nameNotItWithMarkOver7);

        System.out.println("\n Salaries:");
        List<Double> salaries = employees
                .stream()
                .map(empo -> empo.getSalary())
                .toList();

        System.out.println(salaries);
        System.out.println("\n Total Salaries:");
        Optional<Double> reduce = salaries
                .stream()
                .reduce(Double::sum);
        final Double totalSalary = reduce.orElse(0d);

        System.out.println(totalSalary);
        System.out.println("\n Max Salary:");
        Double maxSalary = salaries
                .stream()
                .max(((o1, o2) -> (int) (o1-o2)))
                .orElse(0d);

        System.out.println(maxSalary);
        System.out.println("\n Count Developers: ");
        long count =
                employees
                        .stream()
                        .filter(e -> e.getPosition() == Position.DEVELOPER)
                        .count();
        System.out.println(count);

        System.out.println("\n Employee with max salary:");
        String employeeWithMaxSalary = employees
                .stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .map(e -> "Name: " + e.getName() + " Salary: " + e.getSalary())
                .toString();
        System.out.println(employeeWithMaxSalary);

        System.out.println("\n Elementy int: ");
        int[] values = {1,5,3,4,12,25,83,41};
        IntStream valuesStream = Arrays.stream(values);
        int[] intsParis = valuesStream
                .filter(i -> i % 2 == 0)
                .toArray();
        System.out.println(Arrays.toString(intsParis));


    }
}