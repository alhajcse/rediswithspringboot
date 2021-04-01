package redis.test.redisimplementation.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import redis.test.redisimplementation.model.User;
import redis.test.redisimplementation.service.UserService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/v1/")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    @Cacheable(value = "users",key = "#id")
    public Optional<User> getInformationById(@PathVariable("id") Integer id){
        return userService.getUserInformationById(id); }

    @PostMapping("/save")
    public User saveInformation(@RequestBody User teacherInformation){
        return userService.saveUserInformation(teacherInformation); }


    @GetMapping("/all")
    public List<User> getInformationAll(){
        return userService.getUserAll(); }

}
