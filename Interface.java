public class Interface {
    public static void main(String[] args) {

    }
}

interface ChessPlayer(){

    void moves();
}

class Queens implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right(diagonal in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class Pawn implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right(diagonal by 1 step)");
    }
}