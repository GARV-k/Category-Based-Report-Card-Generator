public class student extends person{
    String Category;
    int cutoff;
    Subject subj1;
    Subject subj2;
    Subject subj3;
    Subject subj4;
    private double CPI;
    public student(String s, int age){

        this.setname(s);
        this.setage(age);
        //this.access_bit = 0;
        this.setCutoff(9);
        this.setCategory("GEN");
    }

    public void setCategory(String s){
        this.Category = s;

    }
    public String getCategory(){
        return this.Category;
    }
    public void setCutoff(int n){
        this.cutoff = n;
    }
    public int getCutoff(){
        return this.cutoff;
    }
    public void set_CPI(double n){
        this.CPI = n;
    }
    public double get_CPI(){
        return this.CPI;
    }
    public double CPI(){
        int sum = ((this.subj1.get_credits())*(this.subj1.subj_grade.getPointer())) + ((this.subj2.get_credits())*(this.subj2.subj_grade.getPointer())) +((this.subj3.get_credits())*(this.subj3.subj_grade.getPointer())) + ((this.subj4.get_credits())*(this.subj4.subj_grade.getPointer()));
        int total = ((this.subj1.get_credits())*(10) + (this.subj2.get_credits())*(10) + (this.subj3.get_credits())*(10) + (this.subj4.get_credits())*(10));
        double cpi = ((double)sum/total)*10;
        return cpi;
    }


}
