package first;

/**
 *
 * @author tungl
 */
public class First {

    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student();
        Student s2 = new Student("HExxxx", "Tung", "02-02-2002", "Male", "HN");
        //Display Student
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
        // Display info (Get/Set):
        System.out.println("MSV: "+s2.getMsv());
        s2.setMsv("HE123");
        System.out.println("MSV-new(sau khi dung set): "+s2.getMsv());
        System.out.println("S2: "+s2);
        // Student info S1:
        System.out.println("============Info s1==============");
        s1.setMsv("HE111");
        s1.setGender("male");
        s1.setAddress("HN");
        System.out.println("S1 info: "+s1);
        
    }
}
