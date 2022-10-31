package src;

import java.util.Random;

public class AC {


    public static void main(String[] args) {

     /*   AAC ob = new AAC();

        ob.setId(1234);
        ob.setName("Parth");
     */
        AC ob = new AC(2222, "Nisha");
        //  AAC ob = new AAC( "PATEL");

        System.out.println(ob.getId() + "  " + ob.getName());

    }


    private int id;
    private String name;

    public AC(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public AC(String name) {
        this.id = new Random().nextInt(2000);
        this.name = name;
    }

    public AC() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
