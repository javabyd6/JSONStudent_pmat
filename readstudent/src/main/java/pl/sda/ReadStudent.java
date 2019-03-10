package pl.sda;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author pmatusiak
 */
public class ReadStudent {

    private static ObjectMapper mapper = new ObjectMapper();

    public static void readStudents(){
        {
            try {
                Student[] students = mapper.readValue(new File("Student.json"), Student[].class);
                List<Student> studentList = Arrays.asList(students);
                System.out.println(studentList.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void studentNameStartsWith(String letter){
        {
            try {
                Student[] students = mapper.readValue(new File("Student.json"), Student[].class);
                List<Student> studentList = Arrays.asList(students);
                studentList.stream()
                        .filter(x -> x.getName().startsWith(letter))
                        .forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        readStudents();
        studentNameStartsWith("A");
    }
}
