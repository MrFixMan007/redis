package org.example;
import redis.clients.jedis.Jedis;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.set("kkf", "fgg");
        System.out.println(jedis.get("kkf"));
    }
}