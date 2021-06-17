public class Employee {
    // Properties or states
    private int id;
    private String fname;
    private String lname;
    //    Department dep;
    private String pos;

    //Constructor
    public Employee(){
        this("mook","kiko");
    }
    public Employee(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }


    // Behaviors or methods
    void doSmt() {

    }

    public String getFullName() {
        return fname + " : " + lname;
    }

    String getPositionName() {
        return "";
    }
}