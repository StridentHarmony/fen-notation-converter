public class Converter {
  static char[][] fenConverter(String fenNotation) {
    String[] trimmedNotation = fenNotation.split(" ", 6);

    String stageOne = trimmedNotation[0].replace("1"," ");
    String stageTwo = stageOne.replace("2","  ");
    String stageThree = stageTwo.replace("3","   ");
    String stageFour = stageThree.replace("4","    ");
    String stageFive = stageFour.replace("5","     ");
    String stageSix = stageFive.replace("6","      ");
    String stageSeven = stageSix.replace("7","        ");
    String stageEight = stageSeven.replace("8","         ");

    String[] fenArray = stageEight.split("/", 8);

    char[][] board = new char[fenArray.length][];
    for (int i = 0; i < fenArray.length; i++) {
      board[i] = fenArray[i].toCharArray();
    }

    return board;
  }
}
