package src;

public class AH_Student2 implements Comparable<AH_Student2>{

    //private int id;
    private Integer id;
    private String firstName;


    public AH_Student2(int id, String firstName) {
        super();
        this.id = id;
        this.firstName = firstName;

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



    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName +"]";
    }

    @Override
    public int compareTo(AH_Student2 o) {

        if(this.firstName.compareTo(o.getFirstName()) == 0)
        {
            return this.id.compareTo(o.getId());
        }
        else
        {
            return this.firstName.compareTo(o.getFirstName());
        }
    }

    // IF WE WANTED TO SORT BY LASTNAME.

/*	@Override
	public int compareTo(AAH_Student2 o) {

		return this.lastName.compareTo(o.getLastName());
	}
	*/
}
