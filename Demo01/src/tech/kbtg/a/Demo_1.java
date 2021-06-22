package tech.kbtg.a;

public class Demo_1 {
    public static int count = 50;

    //Constant
    public static final int xyz=1234;

    public static void main(String[] args){
        callStatic();
        Demo_1.callStatic();

        Demo_1 demo1= new Demo_1();
        demo1.callNonStatic();
        // demo1.callstatic();  ผิด ควรไปทำแบบบันทัดที่6

        System.out.println("befor: "+ count);
        Other Other1 = new Other();
        Other1.todo();
        System.out.println("after: " + count);


    }

    private void callNonStatic(){}
    private static void callStatic(){}


}
class Other{
        void todo(){
            Demo_1.count = 10; //count เป็น final จะทำให้ไม่สามารถแก้ไขค่าได้แล้ว
            //public static final int count = 10;
        }

}
