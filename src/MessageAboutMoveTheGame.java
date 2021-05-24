public class MessageAboutMoveTheGame {
    public void outputMessageAboutNumberMatchesInGame(int numberMatchesInGame) {
        System.out.println("На столе осталось " + numberMatchesInGame  + " спичек.");
    }
    public void outputMessageAboutMoveTheComputer(int moveComputer) {

        System.out.println("- Количество выбранных компьютером спичек = " + moveComputer + ".");

    }
    public void outputMessageAboutMoveThePlayer() {

        System.out.print("- Ход игрока. Введите количество спичек: ");

    }
    public void outputMessageAboutEndOfTheGame() {

        System.out.print("Для игрока осталась последняя спичка. Игрок проиграл!");

    }
    public void outputMessageAboutMistakeInput() {

        System.out.println("Некорректное количество спичек!");

    }
}
