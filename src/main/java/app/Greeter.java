package app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Controller for greeting using a given name.</p>
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2021-04-20
 */
@RestController
public class Greeter {

    @GetMapping(value = "/greet/{name}")
    public String greetUser(@PathVariable String name) {
        return String.format("Hello, %s!", name);
    }
}
