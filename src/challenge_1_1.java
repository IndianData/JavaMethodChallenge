public class challenge_1_1 {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Chuck",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Buck",highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Tiny",highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Floppy",highScorePosition);

    }
    public static void displayHighScorePosition(String player_Name, int highScorePosition){
        System.out.println(player_Name + " managed to get into position " + highScorePosition + " on the high score list!");
    }
    public static int calculateHighScorePosition(int player_score){
        if (player_score >= 1000){
            return 1;
        } else if (player_score >= 500 && player_score < 1000) {
            return 2;            
        } else if (player_score >= 100 && player_score < 500) {
            return 3;
        }else{
            return 4;
        }
    }
}
