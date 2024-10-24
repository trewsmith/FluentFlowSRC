
public class Lesson {
    //each lesson needs a score
    int correctAnswers = 0;
    int incorrectAnswers = 0;
    int currentQuestion = 0;

    private Question []  questions = new Question[10];

    public Lesson (String type, String genre, int level){
        //these two will be sent in so the computer can randomly select question om level and of the type

        //loading the questions
        for (int k = 0; k < 10; k++){
            questions[k] = new Question(type, genre, level);
        }

    }

    public Question getQuestion() {

        return questions[currentQuestion];

    }


}
