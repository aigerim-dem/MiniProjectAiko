public class human {
    int id;
    String name;
    String surname;
    double gpa;

    public human(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    public human (){

    }


    public String getStudentData(){
        return (id + " " + name + " " + surname + " " + gpa);
    }

    public double getStudentGpa(){
        return gpa;
    }




}

