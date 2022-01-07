import java.util.List;

public class Main {

    public static void main(String[] args) {
	RewriteMe rewriteMe = new RewriteMe();
	Database database = new Database();
	List<Question> questions = database.getQuestions();

	Category category ;


        System.out.println(rewriteMe.getAmountOfQuestionsForACertainCategory(Category.FOOD));

        System.out.println(rewriteMe.getListOfAllQuestions());

        System.out.println(rewriteMe.getAllQuestionStringsBelongingACategory(Category.FOOD));

        System.out.println(rewriteMe.getAllAnswerOptionsDistinct());;

    }
}
