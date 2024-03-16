public class ShardContainer {
    int max_shard, skura_shard;
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
    public int getCapacity() {
        return this.max_shard - this.skura_shard;
    }

    /// Move
    public int giveShard(int num) {
        int result = num;
        this.skura_shard =- num;
        if (skura_shard < 0) {
            result =+ this.skura_shard;
            this.skura_shard = 0;
        }
        return result;
    }
    public boolean getShard(int num) {
        if (num > this.getCapacity())
            return false;
        else {
            this.skura_shard =+ num;
            return true;
        }
    } 
}
