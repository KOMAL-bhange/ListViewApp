package komal.bhange.listviewapp;

public class Student {
    String name = null;
    String number = null;

    public Student(String Sname, String Snumber) {

        super();

        this.name = Sname;

        this.number = Snumber;
    }

    public String getName() {

        return name;

    }
    public void setName(String Name2) {

        this.name = Name2;

    }
    public String getNumber() {

        return number;

    }
    public void setNumber(String number2) {

        this.number = number2;

    }

    @Override
    public String toString() {

        return  name + " " + number ;

    }

}