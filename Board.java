public class Board {
    Distance distance;
    Shadow shadow;
    Player[] players = new Player[2];

    Board(){
        this.distance = new Distance(10);
        this.shadow = new Shadow(0);
        
        this.players[0] = new Player();
        this.players[1] = new Player();
    }

    // Method
    public void arrow(ShardContainer getter, ShardContainer giver, int shard_num){
        //
        //
    }

    // Basic Action
    public void basic_action_forward(Player player){
        //
        //
    }

    public void basic_action_backward(Player player){
        //
        //
    }

    public void basic_action_recover(Player player){
        //
        //
    }

    public void basic_action_focus(Player player){
        //
        //
    }

    public void basic_action_retreat(Player player){
        //
        //
    }
}
