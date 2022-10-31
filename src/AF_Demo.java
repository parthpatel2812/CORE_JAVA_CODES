package src;

public class AF_Demo {

    public static void main(String[] args) {

        AF_Student s1 = new AF_Student(101,"Parth" , new AF_Course("Java"));

        System.out.println(s1);



        try {
            AF_Student s2 = (AF_Student) s1.clone();

			System.out.println(s2);
			s1.setId(102);
			s1.setName("Patel");

			s1.getCourseName().setCourseNamne("Advance Java");
			System.out.println(s1);
			System.out.println(s2); // If i do any cheang in original Object it reflect on copied Object to.



            /*System.out.println(s2);
            s2.setId(102);
            s2.setName("Patel");
            s2.getCourseName().setCourseNamne("Advance Java");
            System.out.println(s1);
            System.out.println(s2);*/
        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }
    }
}
