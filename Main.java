package Assign1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        Student[] students = {new ItStudent(1, "Amro", "IT", 60, 90, 100),
                new ItStudent(2, "Mohammed", "IT", 50, 88, 92),
                new ArtStudent(3, "Ahmed", "Art", 60, 90, 85),
                new ArtStudent(4, "Ismail", "Art", 55, 82, 80)};
        Arrays.sort(students, new Student() {
        });

        File file = new File(" SortedStudents.txt");
        file.createNewFile();
        FileWriter crunchifyWriter = new FileWriter(file.getAbsoluteFile(), false);
        BufferedWriter bufferWriter = new BufferedWriter(crunchifyWriter);
        for (int i = 0; i < students.length; i++) {
            bufferWriter.write(students[i].toString() + "\n");
        }
        bufferWriter.flush();
        bufferWriter.close();


    }
}
