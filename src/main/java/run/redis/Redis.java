package run.redis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Redis {

    private static JedisPool pool;
    private static Jedis jedis;

    public static void main(String[] argn) {
        // 初始化Redis连接池
        pool = new JedisPool(new JedisPoolConfig(), "127.0.0.1");
        // 从连接池中获取一个连接
        jedis = pool.getResource();

//存取 String
        jedis.set("name", "runoob");
        System.out.println(jedis.get("name"));
        System.out.println("");

//存取Hash
        Map<String, String> map = new HashMap<String, String>();
        map.put("fineld", "one");
        map.put("this", "tokin");
        map.put("like", "baby");
        map.put("yes", "oh no");
        jedis.hmset("myhash", map);

        List<String> list = new ArrayList<String>();
        list.add("fineld");
        list.add("this");
        list.add("like");
        list.add("yes");
        list.add("no");//hash查询没有的返回空
        for (int i = 0; i < list.size(); i++) {
            System.out.println(jedis.hget("myhash", list.get(i)));
        }
        System.out.println("");


//存取List
        List<String> list2 = new ArrayList();
        list2.add("花花世界");
        list2.add("Illusory world");
        list2.add("Illusions are true");
        list2.add("Eternal");
        list2.add("Come on");
        for (int i = 0; i < list2.size(); i++) {
            jedis.lpush("worlds", list2.get(i));
        }
        System.out.println(jedis.lrange("worlds", 0, 10));
        System.out.println("");

//存取Set
        List<String> list3 = new ArrayList<String>();
        list3.add("存取Set");
        list3.add("试试same");
        list3.add("same");//从输出可以看出，不能重复存
        list3.add("same");
        list3.add("nice");
        for (int i = 0; i < list3.size(); i++) {
            jedis.sadd("same", list3.get(i));
        }
        System.out.println(jedis.smembers("same"));
        System.out.println("");


//存取zset（sorted set）
        Map<String, Double> map2 = new HashMap<String, Double>();
        map2.put("第一", 0.0);
        map2.put("第二", 0.0);
        map2.put("第三", 0.0);
        map2.put("第四", 0.0);
        map2.put("第五", 0.0);
        for (int i = 0; i < map2.size(); i++) {
            jedis.zadd("ranking", map2);
//jedis.del("ranking");//清空数据
        }
        System.out.println(jedis.zrangeByScore("ranking", 0, 10));

    }
}