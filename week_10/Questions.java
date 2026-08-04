<<<<<<< HEAD

=======
>>>>>>> e2e2c8b (week1 done)
public class Questions {

    private String question;
    private String option1;
    private String option2;
    private String answer;

<<<<<<< HEAD
    public Questions() {

        // constructor
        question = "Which keyword creates an object?";
        option1 = "new";
        option2 = "class";
        answer = "new";
=======
    public Questions(String question, String option1, String option2, String answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.answer = answer;
>>>>>>> e2e2c8b (week1 done)
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

<<<<<<< HEAD
    public boolean isCorrect(String choice) {
        return choice.equals(answer);
    }
}
=======
    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect(String choice) {
        return choice.equals(answer);
    }
}
>>>>>>> e2e2c8b (week1 done)
