package OOPs.Interface;

public class MedicalClass implements StudentInterface{
    @Override
    public void displayName() {
        System.out.println("Medical Class Name");
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
        return 10;
    }
}
