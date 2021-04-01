package redis.test.redisimplementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class RedisimplementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisimplementationApplication.class, args);
	}

}
