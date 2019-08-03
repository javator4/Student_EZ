package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;


public class App {

    public static void main(String[] args) throws IOException {
        Student student1 = new Student("Waldemar", "Klus", 1);
        Student student2 = new Student("Ewa", "Zyk", 2);
        Student student3 = new Student("Jacek", "Walik", 3);
        Student student4 = new Student("Paweł", "Lozik", 4);
        Student student5 = new Student("Jan", "Malicz", 5);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);

        ObjectMapper objectMapper = new ObjectMapper(); // po skopiowaniu groupID dziedziczy z głównego Pom
        try {
            objectMapper.writeValue(new File("student.json"), students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}