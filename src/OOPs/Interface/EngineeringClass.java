package OOPs.Interface;

//implements keyword used for Interface and method implementation will be here
public class EngineeringClass implements StudentInterface{
    @Override
    public void displayName() {
        System.out.println("Engineering Class Name");
    }

    @Override
    public void getStudentNumber() {
        System.out.println("Engineering Class StudentNumber");
    }

    @Override
    public void getStandard() {
        System.out.println("120 Engineer Students");
    }

    @Override
    public int getGrade() {
        return 0;
    }

}
