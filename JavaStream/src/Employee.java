import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private int mark;
    private Position position;

    public Employee(String name, double salary, int mark, Position position) {
        this.name = name;
        this.salary = salary;
        this.mark = mark;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getMark() {
        return mark;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.getSalary(), getSalary()) == 0 && getMark() == employee.getMark() && Objects.equals(getName(), employee.getName()) && getPosition() == employee.getPosition();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSalary(), getMark(), getPosition());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", mark=" + mark +
                ", position=" + position +
                '}';
    }
}
