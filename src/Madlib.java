public class Madlib {
    public String  classmate = "George";
    public String  city = "Boston";
    public String  noun = "Basketball";
    public String  adjective = "Red";
    public String  pluralNoun = "Shoes";
    public String pluralanimal = "Mice";
    public boolean trueorfalse = true;
    public double decimalbiggerthan1 = 1.5;
    public int number1 = 5;
    public int  number2 = 4;
    public int wholeNumberBetween1And4 = 3;
    public String miltonTeacher = "Mr.Goodman";
    public String miltonDean = "Ms. Sugrue";
    public String letterGrade = "A";
    public String season = "Fall";

    public static void main(String[] args) {
        System.out.println("hello!");
        Madlib myStory = new Madlib();

    }
    public Madlib() {
            //define a string called story for mad lib
            String story = "This weekend I am going camping with "
                    + classmate + ". We are going to a campsite in "
                    + city + ". I packed my " + noun + " and "
                    + pluralNoun + ".  The forecast is calling for a high of "
                    + decimalbiggerthan1 + " degrees fahrenheit. So it should be a "
                    + adjective + " day! This year, the park rangers have seen "
                    + number1 + " " + pluralanimal + " which seems kind of dangerous. "
                    + miltonTeacher + " said it's " + trueorfalse + " that " + pluralanimal + " eat class "
                    + wholeNumberBetween1And4 + " students in the " + season + ". But, "
                    + miltonDean + " said it actually has only happened "
                    + number2 + " times. Wish us luck! If we survive, we will earn a "
                    + letterGrade + "- in P.E. class.";
            System.out.println(story);
//now print story to the dos window

    }


}
