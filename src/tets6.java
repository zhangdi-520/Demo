import java.util.Random;

public class tets6 {
    public static void main(String[] args) {
//        double percent = 10;
//        tripleValue(percent);
//        System.out.println(percent);
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry",40000);
        staff[1] = new Employee(600000);
        staff[2] = new Employee();

        for (Employee e:staff){
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }
    }

    public static void tripleValue(double x){
        x = 3*x;
        System.out.println(x);
    }

    public static void tripleValue2(double x){
        x = 3*x;
        System.out.println(x);
    }
    public static void tripleValue1(double x){
        x = 3*x;
        System.out.println(x);
    }

}

class Employee{
    private static int nextId;

    private int id;
    private String name="";
    private double salary;

    //在类第一次加载时进行初始化，只执行一次
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }
    //每创建一次对象就执行一次
    {
        id=nextId;
        nextId++;
    }

    public Employee(String n,double s){
        name = n;
        salary = s;
    }

    public Employee(double s){
        //执行类
        this("Employee #"+nextId,s);
    }

    public Employee(){

    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }
}
