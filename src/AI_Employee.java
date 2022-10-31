package src;

public class AI_Employee {

    private Integer id;
    private String name;

    public AI_Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AAI_Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
