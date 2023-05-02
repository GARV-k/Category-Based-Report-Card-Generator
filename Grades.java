public class Grades {
    char grade_name;
    public Grades(int n, char x){
        this.grade_name = x;
        this.pointer = n;
    }
    final private int pointer;
    public int getPointer(){
        return this.pointer;
    }
}
