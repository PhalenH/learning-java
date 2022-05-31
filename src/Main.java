public class Main {

    public static double employeeSalary(double hours, double wage, int vaca){
        double weekly = hours * wage;
        double losses = vaca * 8 * hours;
        double salary = (weekly * 52) - losses;
        return salary;
    }
    public static void main(String[] args) {
       double yearly = employeeSalary(40, 35, 5);
        System.out.println(yearly);
    }

}