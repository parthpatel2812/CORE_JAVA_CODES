package src;

public class AH_Student1 implements Comparable<AH_Student1>{
    //private Integer id;
    private int id;
    private String firstName;
    private String lastName;

    public AH_Student1(int id, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    @Override
    public int compareTo(AH_Student1 o) {

        return this.id - o.getId();
    }

}

