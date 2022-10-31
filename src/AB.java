package src;

public class AB implements AB_Inteface1, AB_Interface2
{

    public static void main(String[] args) {

        AB ob = new AB();
        ob.doTask();
    }

/*    @Override
    public void doTask() {
        AAB_Inteface1.super.doTask();
        System.out.println("Overrided method");
    }*/

    @Override
    public void doTask() {
        AB_Interface2.super.doTask();
        System.out.println();
    }
}
