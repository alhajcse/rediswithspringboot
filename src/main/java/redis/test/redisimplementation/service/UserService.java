package redis.test.redisimplementation.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.test.redisimplementation.model.User;
import redis.test.redisimplementation.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUserInformation(User teacherInformation) {

        return  userRepository.save(teacherInformation);
    }

    public Optional<User> getUserInformationById(Integer id) {

        return userRepository.findById(id);
    }


    public List<User> getUserAll() {

        return userRepository.findAll();
    }
}
