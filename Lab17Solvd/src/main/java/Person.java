import java.util.Date;

public class Person {

    private String firstMame;
    private String lastName;

    private  int age;

    private Date date;

    private Car car;

    private Animal animal;

    private Contact contact;

    private Job job;

    private Salary salary;

    public Person(String firstMame, String lastName, int age, Date date, Car car, Animal animal, Contact contact, Job job, Salary salary) {
        this.firstMame = firstMame;
        this.lastName = lastName;
        this.age = age;
        this.date = date;
        this.car = car;
        this.animal = animal;
        this.contact = contact;
        this.job = job;
        this.salary = salary;
    }

    public Person() {
    }

    public String getFirstMame() {
        return firstMame;
    }

    public void setFirstMame(String firstMame) {
        this.firstMame = firstMame;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstMame='" + firstMame + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", car=" + car +
                ", animal=" + animal +
                ", contact=" + contact +
                ", job=" + job +
                ", salary=" + salary +
                '}';
    }
}
