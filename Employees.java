import java.util.Objects;

public class Employees {
    private static int counter = 1;
    private final String fullname;
    private final int id;
    private int departmentNumber;
    private double salary;


    public Employees(String fullname, int departmentNumber, double salary) {
        this.fullname = fullname;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.id = counter++;

    }

    public String getFullname() {
        return fullname;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return id == employees.id && departmentNumber == employees.departmentNumber && Double.compare(salary, employees.salary) == 0 && Objects.equals(fullname, employees.fullname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, id, departmentNumber, salary);
    }
/*@Override
    public boolean equals(Object o) {
        if (this == o) return true; //КАК УБРАТЬ С ЭКРАНА TRUE
        System.out.println("Сотрудник с таким ФИО в этом отделе уже существует");
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return departmentNumber == employees.departmentNumber && Objects.equals(fullname, employees.fullname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, departmentNumber);
    }*/
    /*@Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employees e = (Employees) other;
        return person.equals(e.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person);
    }*/

    @Override
    public String toString() {
        return id + " " + fullname + " " + "Номер отдела: " + departmentNumber + " Зарплата: " + salary;
    }




}
