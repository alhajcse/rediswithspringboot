package redis.test.redisimplementation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import redis.test.redisimplementation.model.User;


public interface UserRepository extends JpaRepository<User,Integer> {

}
