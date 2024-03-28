import java.util.TreeMap;

public class ShardContainer {
    private int maxShard;
    private TreeMap<Integer, Integer> shard;

    // Constructor
    ShardContainer(int max, int shard_num) {
        this.maxShard = max;
        this.shard = new TreeMap<Integer, Integer>();
        this.shard.put(0, shard_num);
    }

    // Method

    /// info
    public int getShardNum(int target) {
        return this.shard.get(target);
    }

    public int getMaxNum() {
        return this.maxShard;
    }

    public int getAllShard() {
        int result = 0;
        for (int value : this.shard.values()){
            result += value;
        }
        return result;
    }

    public boolean checkCapacity(int num) {
        if (this.maxShard < 0)
            return true;
        else if (this.maxShard - this.getShardNum(0) >= num)
            return true;
        else
            return false;
    }

    
    public boolean decreaseShard(int target, int num) {
        if (this.getShardNum(target) >= num){
            int shardNum = this.shard.get(target);
            this.shard.put(target, shardNum-num);

            if (target != 0) // Not Sakura
                this.shard.remove(target);
        }
        else
            return false;
            
        return true;
    }
    public boolean increaseShard(int target, int num) {
        if (this.checkCapacity(num)){
            int shardNum = this.shard.get(target);
            this.shard.put(target, shardNum+num);
        }
        else
            return false;
            
        return true;
    } 
}
