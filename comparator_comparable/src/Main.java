import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Quan",24,"HN");
        Student student2 = new Student("Duong",20,"HN");
        Student student3 = new Student("Tuan",22,"abc");
        Student student4 = new Student("Hau",24 ,"HD");

        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        for (Student st:list) {
            System.out.println(st.toString());

        }

    }

}
