public class Student {
    private int id;
    private static int idCounter = 0;
    private String name;
    private int age;
    private int gradeStart;
    private int gradeEnd;

    public Student(String name, int age, int gradeStart, int gradeEnd) {
        this.id = next();
        this.name = name;
        this.age = age;
        this.gradeStart = gradeStart;
        this.gradeEnd = gradeEnd;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gradeStart=" + gradeStart +
                ", gradeEnd=" + gradeEnd +
                "}";
    }

    public int next() {
        return ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradeStart() {
        return gradeStart;
    }

    public void setGradeStart(int gradeStart) {
        this.gradeStart = gradeStart;
    }

    public int getGradeEnd() {
        return gradeEnd;
    }

    public void setGradeEnd(int gradeEnd) {
        this.gradeEnd = gradeEnd;
    }
}
