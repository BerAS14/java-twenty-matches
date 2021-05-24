import java.util.Scanner;

public class GameTwentyMatches {
    private int numberMatchesInGame = 20;
    private boolean moveTheComputer = true;

    public void startGame()  {
        Computer computer = new Computer();
        Scanner scanner = new Scanner(System.in);
        MessageAboutMoveTheGame messageAboutMoveTheGame = new MessageAboutMoveTheGame();
        int movePlayer = 0;
        int moveComputer;
        while (this.numberMatchesInGame > 1) {
            if (this.moveTheComputer) {
                messageAboutMoveTheGame.outputMessageAboutNumberMatchesInGame(this.numberMatchesInGame);
                moveComputer = computer.makeAMove(movePlayer);
                this.numberMatchesInGame = this.numberMatchesInGame - moveComputer;
                messageAboutMoveTheGame.outputMessageAboutMoveTheComputer(moveComputer);
                this.moveTheComputer = false;
            }
            else {
                do {
                    messageAboutMoveTheGame.outputMessageAboutNumberMatchesInGame(this.numberMatchesInGame);
                    messageAboutMoveTheGame.outputMessageAboutMoveThePlayer();
                    movePlayer = scanner.nextInt();
                    if (movePlayer < 1 || movePlayer > 3) {
                        messageAboutMoveTheGame.outputMessageAboutMistakeInput();
                    }
                }
                while (movePlayer < 1 || movePlayer > 3);
                this.numberMatchesInGame = this.numberMatchesInGame-movePlayer;
                this.moveTheComputer = true;
            }
        }
        messageAboutMoveTheGame.outputMessageAboutEndOfTheGame();
    }
}
