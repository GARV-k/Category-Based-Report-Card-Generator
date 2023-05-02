public class runfile {
    public static void main(String[] args) {
        teacher Hari = new teacher();
        Hari.setname("Hari Kumar");
        Hari.setage(50);

        // the grades and subject below are not inputs, they are fixed for the institution

        Grades A = new Grades(10, 'A');//initializing grades with its grade pointer

        //pointer variable of class cannot be change once set.
        // Below code can show the demonstration once uncommented.
        //A.pointer = 8;

        Grades B = new Grades(9, 'B');
        Grades C = new Grades(8,'C');
        Grades D = new Grades(7,'D');
        Grades E = new Grades(6,'E');
        Grades F = new Grades(5,'F');

        Subject MA101 = new Subject("MA101", 11, A);// initializing subjects with their credits

        //Also it can be clearly seen by uncommenting the below code that changing the credits of a subject gives a error.
        //MA101.credits = 11;

        Subject CY101 = new Subject("CY101", 10, A);
        Subject MA102 = new Subject("MA102", 18, A);
        Subject MA111 = new Subject("MA111", 18, A);
        Subject CSO101 = new Subject("CSO101", 15, A);
        Subject CSO102 = new Subject("CSO102", 14, A);

        //Now three inputs are taken in from the student namely, the name of the student,the age and the category of the student
        //since the assignment guideline says we are not supposed to ask for inputs, so I have directly assigned them

        student Anil = new student("Anil", 18); // input from student
        studentEWS Aman = new studentEWS("Aman", 19); //input from student
        studentPWD Arya = new studentPWD("Arya", 18); //input from student

        // After the details of the students is logged into the academic system
        //the teacher can assign the student with the grades in the respective subjects
        //the grades of the respective subject is taken as input from the teacher

        Hari.set_subj(Anil, MA101, MA102, MA111, CSO101, A, A, C, E);
        Hari.set_subj(Aman, MA101, CY101,CSO101,CSO102, C, C, A, D);
        Hari.set_subj(Arya, MA101, CY101, MA111, CSO102, D, F, A, E);


        Hari.get_repo(Anil);// then the teacher prints the report card for the required students

        System.out.println();
        System.out.println();
        System.out.println();

        Hari.get_repo(Aman);

        System.out.println();
        System.out.println();
        System.out.println();

        Hari.get_repo(Arya);
        System.out.println();
        System.out.println();
        System.out.println();

        //Below is a demonsration of subjgrade_decider method in class teacher
        System.out.println("Is Aman Pass or Fail in MA101? "+ "He is " + Hari.subjgrade_decider(Aman, MA101, C));


    }
}
