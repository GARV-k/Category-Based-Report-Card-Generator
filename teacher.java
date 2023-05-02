public class teacher extends person{
    //public teacher(){
        //this.access_bit = 1;
    //}
    public String subjgrade_decider(student l, Subject s, Grades g) {
        if (l.getCutoff() <= g.getPointer()) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
    public void set_subj(student s, Subject a, Subject b, Subject c, Subject d, Grades A, Grades B, Grades C, Grades D){
        s.subj1 = a;
        s.subj2 = b;
        s.subj3 = c;
        s.subj4 = d;
        s.subj1.subj_grade = A;
        s.subj2.subj_grade = B;
        s.subj3.subj_grade = C;
        s.subj4.subj_grade = D;
        s.set_CPI(s.CPI());
    }
    public void get_repo(student s){
        System.out.println("Name : " + s.getname());
        System.out.println("Age : " + s.getage());
        System.out.println("Category: " + s.getCategory());
        System.out.println((s.subj1.Subj_name) + " : " + s.subj1.subj_grade.grade_name + " || Verdict: " + subjgrade_decider(s,s.subj1, s.subj1.subj_grade));
        System.out.println((s.subj2.Subj_name) + " : " + s.subj2.subj_grade.grade_name + " || Verdict: " + subjgrade_decider(s,s.subj2, s.subj2.subj_grade));
        System.out.println((s.subj3.Subj_name) + " : " + s.subj3.subj_grade.grade_name + " || Verdict: " + subjgrade_decider(s,s.subj3, s.subj3.subj_grade));
        System.out.println((s.subj4.Subj_name) + " : " + s.subj4.subj_grade.grade_name + " || Verdict: " + subjgrade_decider(s,s.subj4, s.subj4.subj_grade));
        System.out.println("CPI for this semester is : " + s.get_CPI());
    }


}
