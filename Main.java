public class Main {
    static Employees[] employees = new Employees[10];

    public static void main(String[] args) {



        employees[0] = new Employees("Иванов Иван Иванович", 4, 123);
        employees[1] = new Employees("Сидоров Степан Геннадьевич", 4, 471);
        employees[2] = new Employees("Петров Алексей Викторович", 3, 194);
        employees[3] = new Employees("Коровкина Наталья Андреевна", 2, 243);
        employees[4] = new Employees("Бубликов Антон Игоревич", 1, 239);
        employees[5] = new Employees("Лермонтов Михаил Юрьевич", 5, 869);
        employees[6] = new Employees("Менделеев Дмитрий Иванович", 5, 899);
        employees[7] = new Employees("Перельман Григорий Яковлевич", 5, 859);
        employees[8] = new Employees("Ломоносов Михаил Васильевич", 5, 916);
        employees[9] = new Employees("Циолковский Константин Эдуардович", 5, 840);

        printAllEmployees();
        System.out.println("Сумма затрат на ЗП составляет: " + printSumSalaryEmployees());
        printMinSalaryEmployees();
        System.out.println("Минимальная ЗП составляет: " + printMinSalaryEmployees());
        printMaxSalaryEmployees();
        System.out.println("Максимальная ЗП составляет: " + printMaxSalaryEmployees());
        printAverageSalaryEmployees();
        System.out.println("Среднее значение ЗП составляет: "+ printAverageSalaryEmployees());



    }
    public static void printAllEmployees() {
        for (Employees e : employees) {
           System.out.println(e);
        }

    }
    public static double printSumSalaryEmployees() {

        double totalSalary = 0;
        for (Employees e : employees) {
            totalSalary = totalSalary + e.getSalary();

        }
        return totalSalary;


    }
    public static Employees printMinSalaryEmployees() {
        Employees minSalaryEmployees = employees[0];
        double minSalary = employees[0].getSalary();

        for (Employees e : employees)
        if  (e.getSalary() < minSalary){
            minSalary = e.getSalary();
            minSalaryEmployees = e;

        }
        return minSalaryEmployees;

    }
    public static Employees printMaxSalaryEmployees() {
        Employees maxSalaryEmployees = employees[0];
        double maxSalary = employees[0].getSalary();

        for (Employees e : employees)
            if  (e.getSalary() > maxSalary){
                maxSalary = e.getSalary();
                maxSalaryEmployees = e;

            }
        return maxSalaryEmployees;

    }
    public static double printAverageSalaryEmployees() {

        double averageSalary = 0;
        double totalSalary = 0;
        for (Employees e : employees) {
            totalSalary = totalSalary + e.getSalary();
            averageSalary = totalSalary/10;

        }
        return averageSalary;


    }
}