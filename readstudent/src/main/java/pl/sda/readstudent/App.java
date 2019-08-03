package pl.sda.readstudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Student[] students =
                    objectMapper.readValue(new File("student.json"), Student[].class);
            System.out.println(students);
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

