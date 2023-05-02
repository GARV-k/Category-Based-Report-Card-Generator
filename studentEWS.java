public class studentEWS extends student{
    String Category = "EWS";
    int cutoff = 7;

    public studentEWS(String s, int age) {
        super(s, age);
        this.setCutoff(7);
        this.setCategory("EWS");
    }
}
