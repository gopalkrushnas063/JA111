package sprint2.day3;

public class _2ObjectCollaboration {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Rani";
        person.city = "Khurda";
        person.zip = "752030";
        System.out.println(person.name);

//.......................................................................
// ......................................................................

        Office office = new Office();
        office.companyName = "Masai School";

        //creating address
        Address masaiAddress = new Address();
        masaiAddress.city = "BLR";
        masaiAddress.zip = "875469";


        //assigning this address to the office
        office.address = masaiAddress;
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

//Nest Eggs
class Nest{
   Egg[] eggs;
}
class Egg{}