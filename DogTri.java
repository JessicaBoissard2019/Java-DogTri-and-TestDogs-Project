// Chapter4 Exercise (pages 142-243)

public class DogTri {

    // instance variables for the class
    private final int NUM_EVENTS;
    private static int totalCumulativeScore = 0;
    private String name;
    private int obedienceScore;
    private int agilityScore;
    private int conformationScore;
    private int total;
    private double avg;

    // custom constructor for this class
    public DogTri(String name, int numEvents, int score1, int score2, int score3) {

        this.name = name;
        NUM_EVENTS = numEvents;
        obedienceScore = score1;
        conformationScore = score2;
        agilityScore = score3;
        total = obedienceScore + conformationScore + agilityScore;
        avg = (double) total / NUM_EVENTS;
        totalCumulativeScore += total;

    }// end of constructor method

    public void display() {
        System.out.println(name + " participated in " + NUM_EVENTS + " events and has an average score of " + avg);
        System.out.println(" " + name + " has a total score to " + total + " bringing the total cumulative score to "
                + totalCumulativeScore);
    }// end of display()

}// end of class block
