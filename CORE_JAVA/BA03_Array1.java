package JAVA_PROGRAMMING.CORE_JAVA;
//INTODUCTION TO ARRAY
public class BA03_Array1 {
    public static void main(String[] args) {
        int marks[]=new int [3]; // data_type Array_Name [] =new data_type [size]
        //-->'new' keyword is used to assign some  memory location to the array
        marks[0]=89; //phy
        marks[1]=90; //chem
        marks[2]=91; //eng
        System.out.println("marks[0] = "+marks[0]);
        System.out.println("marks[1] = "+marks[1]);
        System.out.println("marks[2] = "+marks[2]);

    }
}
