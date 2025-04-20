package be.vdab.jpf5;

public class StudentScores {
    public static void main(String[] args) {
        int score1 = 8;
        int score2 = 6;
        int score3 = 9;
        int score4 = 4;

        float gemiddelde = (score1 + score2 + score3 + score4) / 4F;
        float percentage = gemiddelde * 10F;

        System.out.println("Gemiddelde score: " + gemiddelde);
        System.out.println("Percentage: " + percentage);
    }
}
