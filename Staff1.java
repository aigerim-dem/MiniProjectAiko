public class Staff1 implements Workers{
    int id;
    String name;
    String surname;
    int salary;

    public Staff1(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    @Override
    public String getWorkerData() {
        return "Staff information is following: id " + id + ", name " + name + ", surname " + surname + "salary " + salary;
    }



    @Override
    public int getSalary () {
        return salary;

    }

}
