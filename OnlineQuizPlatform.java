package task2;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineQuizPlatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question("What is the capital of France?", "Paris"));
        questions.add(new Question("What is the largest planet in our solar system?", "Jupiter"));
        questions.add(new Question("What is the smallest country in the world?", "Vatican City"));

        int score = 0;

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String answer = scanner.next();

            if (answer.equalsIgnoreCase(question.getCorrectAnswer())) {
                score++;
            }
        }

        System.out.println("Your score is: " + score + "/" + questions.size());
    }
}

class Question {
    private String questionText;
    private String correctAnswer;

    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
    

