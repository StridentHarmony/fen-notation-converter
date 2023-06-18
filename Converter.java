public class Converter {
  static char[][] fenConverter(String fenNotation) {
    String[] trimmedNotation = fenNotation.split(" ", 6);

    String stageOne=trimmedNotation[0].replace("1"," ");
    String stageTwo=stageOne.replaceAll("2","  ");
    String stageThree=stageTwo.replaceAll("3","   ");
    String stageFour=stageThree.replaceAll("4","    ");
    String stageFive=stageFour.replaceAll("5","     ");
    String stageSix=stageFive.replaceAll("6","      ");
    String stageSeven=stageSix.replaceAll("7","        ");
    String stageEight=stageSeven.replaceAll("8","         ");

    String[] fenArray = stageEight.split("/", 8);
    return ;
  }
}
