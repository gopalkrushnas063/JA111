package sprint2.object_Collaboration;

public class ObjCol {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "abc";
        person.city = "city";
        person.zip = "644546";
        System.out.println(person.city);

        Office office = new Office();
        office.companyName = "Masai School";

        //Creating address
        Address companyAddress = new Address();
        companyAddress.city = "Bhubaneswar";
        companyAddress.zip = "752010";

        //assigning this address to the office
        office.address = companyAddress;
        System.out.println(office.companyName);
        System.out.println(office.address.city);
    }
}
class Person{
    String name;
    String city;
    String zip;
}

class Address{
    String city;
    String zip;
}

class Office{
    String companyName;
    Address address; //composition
}

