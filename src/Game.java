import java.util.Scanner;

public class Game {
    private Player player;
    private Player opponent;

    private static int numOfGames;
    private static int tied;

    public Game (){
        player = new Player();
        opponent = new Player();
        tied = 0;
        getNumOfGamesFromUser();

        play();
        displayResults(player.getWin(),opponent.getWin());

    }
    public int getNumOfGamesFromUser(){
        System.out.println("How many games do you want to simulate?");
        Scanner scanner = new Scanner(System.in);
        numOfGames = scanner.nextInt();
        return numOfGames;
    }
    public void play (){
        for (int i = 0; i <numOfGames; i++){
            player.roll();
            opponent.roll();

            if (player.getRoll() > opponent.getRoll()){
                player.setWin();
            } else if (player.getRoll() < opponent.getRoll()){
                opponent.setWin();
            } else {
                tied++;
            }
        }
    }
    public void  displayResults (int userWin, int compWin){
        System.out.println("RESULTS:");
        System.out.println("User wins......."+ userWin) ;
        System.out.println("Computer wins......."+ compWin);
        System.out.println("Tied games......."+ tied);

        if (userWin > compWin){
            System.out.println("You won!");
        } else if (compWin > userWin) {
            System.out.println("You lost!");

        }else {
            System.out.println("Game was tied!");
        }
    }





}
