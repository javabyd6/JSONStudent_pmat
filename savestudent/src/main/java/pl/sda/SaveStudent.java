package pl.sda;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pmatusiak
 */
public class SaveStudent {

    private static ObjectMapper mapper = new ObjectMapper();

    public static void createStudentList(){
        Student student1 = new Student("A", "A", 0001);
        Student student2 = new Student("B", "B", 0002);
        Student student3 = new Student("C", "C", 0003);
        Student student4 = new Student("D", "D", 0004);
        Student student5 = new Student("E", "E", 0005);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        try {
            mapper.writeValue(new File("Student.json"),studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createStudentList();
    }
}
