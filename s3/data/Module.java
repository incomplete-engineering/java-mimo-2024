package s3.data;

public class Module {

    private String moduleName;
    private String studentName;
    private double dsNote;
    private double tpNote;
    private double examNote;

    //tp + ds + ex*2 le tout sur 4
    public String getModuleName() {
        return moduleName;
    }
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public double getDsNote() {
        return dsNote;
    }
    public void setDsNote(double dsNote) {
        this.dsNote = dsNote;
    }
    public double getTpNote() {
        return tpNote;
    }
    public void setTpNote(double tpNote) {
        this.tpNote = tpNote;
    }
    public double getExamNote() {
        return examNote;
    }
    public void setExamNote(double examNote) {
        this.examNote = examNote;
    }
    public String getMoyenne() {
        double moyenne = (tpNote + dsNote + examNote*2) / 4;
        return "La moyenne de " + studentName + " est: " + moyenne;
    }



    



}
