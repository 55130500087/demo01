public class Employee {
    //Properties
    int id;
    String firstname;
    String lastname;
    String dept;
    String positionname;

    //Constructor
    public Employee(){

    }

    public Employee(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //Behaviors or method
    String getFullName(){
        return firstname +" : " + lastname;
    }

    String getPositionname(){
        return "";
    }
}
