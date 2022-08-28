public class Main {
    public static void main(String[] args) {
        Employee faruk=new Employee("faruk",12000,40,2010);
        System.out.println(faruk.toString());
        faruk.tax();
        faruk.bonus();
        faruk.raiseSalary();

    }
}
