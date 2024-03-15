public class ShardContainer {
    int cb_shard;
    // Should Check Special Shard

    // Constructor
    ShardContainer(int shard_num) {
        this.cb_shard = shard_num;
    }

    // Method
    public int giveShard(int num) {
        return num;
    }

    public int getShard(int num) {
        return num;
    } 
}
