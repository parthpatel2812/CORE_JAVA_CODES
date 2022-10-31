package src;

public class AH_Employee implements Comparable<AH_Employee>{

    private String lastName;
    private String firstName;
    private int eId;
    private AH_Department department;

    public AH_Employee(String lastName, String firstName, int eId, AH_Department department) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.eId = eId;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [lastName=" + lastName + ", firstName=" + firstName + ", eId=" + eId + ", department="
                + department + "]";
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public AH_Department getDepartment() {
        return department;
    }

    public void setDepartment(AH_Department department) {
        this.department = department;
    }

    @Override
    public int compareTo(AH_Employee o) {

        if(this.department.compareTo(o.getDepartment()) == 0)
        {
            return this.lastName.compareTo(o.getLastName());
        }
        else
        {
            return this.department.compareTo(o.getDepartment());
        }

    }







	/*private String ename;
	private Department department;

	public Employee(String ename, Department department) {
		super();
		this.ename = ename;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", department=" + department + "]";
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public int compareTo(Employee o) {

		if(this.department.compareTo(o.getDepartment())==0)
		{
			return this.ename.compareTo(o.getEname());

		}
		else
		{
			return this.department.compareTo(o.getDepartment());
		}



	}
	*/
}
