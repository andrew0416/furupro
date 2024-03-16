public class ShardContainer {
    private  int max_shard, skura_shard;
    // Should Check Special Shard

    // Constructor
    ShardContainer(int max, int shard_num) {
        this.max_shard = max;
        this.skura_shard = shard_num;
    }

    // Method

    /// info
    public int getShardNum() {
        return this.skura_shard;
    }
    public int getMaxNum() {
        return this.max_shard;
    }
    public boolean checkCapacity(int num) {
        if (num <= 0)
            return true;
        else if (this.max_shard - this.skura_shard >= 0)
            return true;
        else
            return false;
    }

    /// Move
    public boolean decreaseShard(int num) {
        if (this.skura_shard < num)
            return false;
        else {
            this.skura_shard =- num;
            return true;
        }
    }
    public boolean increaseShard(int num) {
        if (checkCapacity(num)){
            this.skura_shard =+ num;
            return true;
        }
        else
            return false;
    } 
}
