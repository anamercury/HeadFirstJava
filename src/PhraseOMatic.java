/**
 * Created by Дім on 26.04.2016.
 */
public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"Я помню", "Не помню","Забыть бы","Купите","Очкуешь","Какое","Угробил","Хреново", "Открою", "Ты чуешь?"};

        String[] wordListTwo = {"чудное", "странное","некое","вкусное","пьяное","свинское","чоткое","сраное", "нужное", "конское"};

        String[] wordListThree = {"мгновенье", "затменье","хотенье","варенье","творенье","везенье","рожденье","смущенье", "печенье", "ученье"};

        String[] wordListFour = {"передомной", "под косячком","на кладбище","в моих мечтах","под скальпием","в моих штанах","из-за угла","в моих ушах", "в ночном горшке", "из головы"};

        String[] wordListFive = {"явилась ты", "добилась ты","торчат кресты","стихов листы","забилась ты","мои трусы","поют дрозды","из темноты", "помылась ты", "дают пизды"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int fourLength = wordListFour.length;
        int fiveLength = wordListFive.length;

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);
        int rand4 = (int) (Math.random()*fourLength);
        int rand5 = (int) (Math.random()*fiveLength);

        String phrase = wordListOne[rand1]+ " " + wordListTwo[rand2] + " " + wordListThree[rand3] + " " + wordListFour[rand4] + " " + wordListFive[rand5];

        System.out.println(phrase);
    }
}
