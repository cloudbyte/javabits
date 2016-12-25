package challenge;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Raj on 12/24/16.
 */

public class SortComparator {

    public static void main(String args[]){

        Player players[] = new Player[3];

        Player player = new Player();
        player.name = "Raj";
        player.score = 100;
        players[0] = player;

        player = new Player();
        player.name = "Arun";
        player.score = 90;
        players[1] = player;

        player = new Player();
        player.name = "Charan";
        player.score = 99;
        players[2] = player;


        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.score - o1.score;
            }
        });


        for(Player playerOut: players){
            System.out.println(playerOut.name);
        }

    }

}


class Player
{
    public String name;
    public int score;
}
