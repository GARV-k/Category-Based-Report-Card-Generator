public class Subject {
    String Subj_name;
    Grades subj_grade;
    private int credits;
    public Subject(String s, int c, Grades A ){
        this.Subj_name = s;
        this.credits = c;
        this.subj_grade = A;
    }
    public int get_credits(){
        return this.credits;
    }

}
