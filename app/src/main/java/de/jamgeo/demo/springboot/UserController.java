package de.jamgeo.demo.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController()
public class UserController {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    UserService indexService;

    @Autowired
    private
    UserRepository userRepository;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public @ResponseBody List<User> getAllUsers() {
        logger.info("Getting all users.");
        return userRepository.findAll();
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public @ResponseBody Optional<User> getUser(@PathVariable String userId) {
        logger.info("Getting user with ID: " + userId);
        return userRepository.findById(userId);
    }


}
