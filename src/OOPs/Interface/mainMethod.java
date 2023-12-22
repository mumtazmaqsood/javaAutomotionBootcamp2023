package OOPs.Interface;

public class mainMethod  {
    public static void main(String[] args){
        EngineeringClass obj = new EngineeringClass();
        obj.displayName();
        obj.getStudentNumber();
        obj.getStandard();
        System.out.print(obj.getGrade());

        System.out.println("**************************************");
        MedicalClass md = new MedicalClass();
        md.displayName();
        md.getStudentNumber();
        md.getStandard();
        System.out.print(md.getGrade());

    }
}
