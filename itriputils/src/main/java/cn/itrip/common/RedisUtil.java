package cn.itrip.common;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {  // redisAPI
    @Resource
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 存redis  不设置失效时间
     * @param key
     * @param value
     */
    public void set(String key, String value) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value);
    }

    /**
     * 存redis  设置了失效时间
     * @param key
     * @param value
     * @param seconds
     */
    public void setex(String key, String value, int seconds) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value, seconds, TimeUnit.SECONDS);//    key  value  失效时间   失效时间的格式
    }

    /**
     * 根据key获取token
     * @param key
     * @return
     */
    public String get(String key) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        return valueOperations.get(key);
    }

    /**
     * 判断key是否存在
     * @param key
     * @return
     */
    public boolean exists(String key){
        return redisTemplate.hasKey(key);
    }

    /**
     * 删除redis
     * @param key
     * @return
     */
    public boolean del(String key){
        Boolean result = redisTemplate.delete(key);
        return result;
    }
    //判断token还有多久过期
    public long ttl(String key){
        long result = redisTemplate.getExpire(key); //获取过期时间
        return result;
    }
}
