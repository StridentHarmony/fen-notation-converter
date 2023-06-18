public class Converter {
  static char[][] fenConverter(String fenNotation) {
    try {
      String[] trimmedNotation = fenNotation.split(" ", 6);

      String stageOne=trimmedNotation[0].replace("1"," ");
      String stageTwo=stageOne.replace("2","  ");
      String stageThree=stageTwo.replace("3","   ");
      String stageFour=stageThree.replace("4","    ");
      String stageFive=stageFour.replace("5","     ");
      String stageSix=stageFive.replace("6","      ");
      String stageSeven=stageSix.replace("7","        ");
      String stageEight=stageSeven.replace("8","         ");

      String[] fenArray = stageEight.split("/", 8);

      
    } catch (PatternSyntaxException) {
      System.out.println("Invalid FEN notation!");
    }

    return ;
  }

  public static void main(String[] args) {
    System.out.println(fenConverter("k7/p2q4/3br3/8/7N/8/5K2/8 w - - 0 1"));
  }
}
