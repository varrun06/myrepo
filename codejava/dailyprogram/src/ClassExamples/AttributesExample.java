package ClassExamples;

public class AttributesExample {
    private String name;
    private int score1;
    private int score2;
    private int score3;
    private String answer;

    // Constructor
    public AttributesExample(String name, int score1, int score2, int score3, String answer) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.answer = answer;
    }

    // Getters and setters (you can generate these automatically in most IDEs)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public int getScore3() {
        return score3;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Other methods, if needed

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", score3=" + score3 +
                ", answer='" + answer + '\'' +
                '}';
    }
}

