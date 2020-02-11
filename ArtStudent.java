package Assign1;

public class ArtStudent extends Student {

    public ArtStudent(int id, String name, String major, int mid, int project, int finalExam) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = mid * 0.30 + project * 0.30 + finalExam * 40;
    }

}
