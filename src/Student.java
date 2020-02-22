public class Student extends Person {
    private int stdID;
    public Student(String firstName , String lastName , int age,int stdID){
        super(firstName,lastName,age);
        this.stdID=stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public int getStdID() {
        return stdID;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(stdID);
    }
}
