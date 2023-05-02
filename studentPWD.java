public class studentPWD extends student{

    public studentPWD(String s, int age) {
        super(s, age);
        this.setCutoff(6);
        this.setCategory("PWD");
    }

}
