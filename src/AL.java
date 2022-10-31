package src;

import java.util.Objects;

public class AL {

    private String name;
    private Integer id;

    public AL(String name, Integer id) {
        super();
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "AAL [name=" + name + ", id=" + id + "]";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AL)) return false;
        AL AL = (AL) o;
        return getName().equals(AL.getName()) &&
                getId().equals(AL.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }
}
