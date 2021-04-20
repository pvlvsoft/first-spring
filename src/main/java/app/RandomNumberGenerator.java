package app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * <p>Controller responsible for generating random {@code int} number
 * used for REST returning</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2021-04-20
 */
@RestController
public class RandomNumberGenerator {

    private Random random = new Random();

    @GetMapping(value="/random")
    public int generateRandomNumber() {
        return random.nextInt();
    }
}
