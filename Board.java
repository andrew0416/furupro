public class Board {
    Distance distance;
    Dust dust;
    Player[] players = new Player[2];

    Board(){
        this.distance = new Distance(10);
        this.dust = new Dust(0);
        
        this.players[0] = new Player();
        this.players[1] = new Player();
    }
}
