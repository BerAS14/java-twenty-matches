public class Computer {
    public int makeAMove(int movePlayer) {
        if (movePlayer==0) {
            return(3);
        }
        return (4-movePlayer);

    }
}
