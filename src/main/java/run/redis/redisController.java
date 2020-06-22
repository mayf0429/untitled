package run.redis;

import modules.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class redisController {
    //查询redis运行次数
    @Test
    public void redisTester() {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        // 最大空闲数
        poolConfig.setMaxIdle(50);
        // 最大连接数
        poolConfig.setMaxTotal(100);
        // 最大等待毫秒数
        poolConfig.setMaxWaitMillis(20000);
        // 使用配置创建连接池
        JedisPool pool = new JedisPool(poolConfig, "localhost");
        // 从连接池中获取单个连接
        Jedis jedis = pool.getResource();
        // 如果需要密码
        //jedis.auth("password");
       /* Jedis jedis = new Jedis("localhost", 6379, 100000);*/
        int i = 0;
        try {
            long start = System.currentTimeMillis();// 开始毫秒数
            while (true) {
                long end = System.currentTimeMillis();
                if (end - start >= 1000) {// 当大于等于1000毫秒（相当于1秒）时，结束操作
                    break;
                }
                i++;
                jedis.set("test" + i, i + "");
            }
        } finally {// 关闭连接
            jedis.close();
        }
        // 打印1秒内对Redis的操作次数
        System.out.println("redis每秒操作：" + i + "次");
    }

    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        RedisTemplate redisTemplate = context.getBean(RedisTemplate.class);
        Student student = new Student();
        student.setName("测测测");
        student.setAge(21);
        redisTemplate.opsForValue().set("sss", student);
        Student student1 = (Student) redisTemplate.opsForValue().get("student_1");
        student1.service();
    }
}
