public class Main {
    public static void main(String[] args) {
        String fname = args[0];
        String lname = args[1];
        Employee Tanyaluk = new Employee(fname,lname); // Default constructor
        String result = Tanyaluk.getFullName();
        System.out.println(result);
    }
}//