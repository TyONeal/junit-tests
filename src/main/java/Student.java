import java.util.ArrayList;

public class Student {

    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        int total = 0;
        for(int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }
}
