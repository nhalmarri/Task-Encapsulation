public class Student {

    private String name;
    private int age;
    private double gpa;

    //constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        setGpa(gpa);

    }

    //getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGpaStatus() {

        String status ;

        if( gpa > 3){
            status = "Excellent!";
            return status;
        } else if ( gpa <= 3 && gpa > 2){
            status = "Good.";
            return status;
        } else {
            status = "Needs Improvement.";
            return status;
        }


    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {

        if ( gpa < 0.0 || gpa > 4.0){
            this.gpa = 0.0;
            System.out.println("GPA out of range !!");
        }

    }







} //end of class
