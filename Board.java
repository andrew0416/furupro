public class Board {


    ShardContainer Distance = new ShardContainer(10, 10);
    Player[] players = new Player[2];

    Board(){
        
                this.players[0] = new Player();
        this.players[1] = new Player();
    }

    // Method
    public void arrow(ShardContainer getter, ShardContainer giver, int shard_num){
        int movingShard = Math.min(shard_num, getter.getCapacity());
        getter.getShard(giver.giveShard(movingShard));
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
