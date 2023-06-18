public class Converter {
  static char[][] fenConverter(String fenNotation) {
    String[] trimmedNotation = fenNotation.split(" ", 6);

    System.out.println("splitNotation:");
    for (int l = 0; l < trimmedNotation.length; l++) {
      System.out.println(trimmedNotation[l]);
    }

    String stageOne = trimmedNotation[0].replace("1"," ");
    String stageTwo = stageOne.replace("2","  ");
    String stageThree = stageTwo.replace("3","   ");
    String stageFour = stageThree.replace("4","    ");
    String stageFive = stageFour.replace("5","     ");
    String stageSix = stageFive.replace("6","      ");
    String stageSeven = stageSix.replace("7","       ");
    String stageEight = stageSeven.replace("8","        ");

    System.out.println("stageEight:");
    System.out.println(stageEight);

    String[] fenArray = stageEight.split("/", 8);

    System.out.println("fenArray:");
    for (int h = 0; h < fenArray.length; h++) {
      System.out.println(fenArray[h]);
    }

    char[][] board = new char[fenArray.length][];
    for (int i = 0; i < fenArray.length; i++) {
      board[i] = fenArray[i].toCharArray();
    }

    return board;
  }

  public static void main(String[] args) {
    String testNotation = "";

    char[][] testBoard = fenConverter(testNotation);

    System.out.println("Result:");
    for (int b = 0; b < testBoard.length; b++) {
      System.out.println(testBoard[b]);
    }
  }
}