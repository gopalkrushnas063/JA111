package sprint2.day3;

public class _7UserDefinedObjectAsMethodIO {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.age = 23;
        System.out.println(myMethod(employee));


        Employee employee1 = createObject();
        if(employee1 == null)
            System.out.println("Employee age is null, cant print the age");
        else
            System.out.println(employee1.age);
    }

    static int myMethod(Employee employee){
        return employee.age;
    }
    static Employee createObject(){
        // null is the subtype of all the objects
         return null;
        //return new Employee();
    }

}

class Employee{
    int age;
}
