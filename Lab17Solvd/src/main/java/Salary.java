public class Salary {

    private String valueOfSalary;

    public Salary() {
    }

    public Salary(String valueOfSalary) {
        this.valueOfSalary = valueOfSalary;
    }

    public String getValueOfSalary() {
        return valueOfSalary;
    }

    public void setValueOfSalary(String valueOfSalary) {
        this.valueOfSalary = valueOfSalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "valueOfSalary='" + valueOfSalary + '\'' +
                '}';
    }
}
