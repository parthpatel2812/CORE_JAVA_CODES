package src;

public class AJ_Employee {

    private Integer empId;
    private String empNmae;

    public AJ_Employee(Integer empId, String empNmae) {
        this.empId = empId;
        this.empNmae = empNmae;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpNmae() {
        return empNmae;
    }

    public void setEmpNmae(String empNmae) {
        this.empNmae = empNmae;
    }

    @Override
    public String toString() {
        return "AAJ_Employee{" +
                "empId=" + empId +
                ", empNmae='" + empNmae + '\'' +
                '}';
    }
}
