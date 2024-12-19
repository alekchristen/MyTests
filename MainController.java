package io.reflectoring.demo.Controllers;

import io.reflectoring.demo.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    private final KafkaProducer kafkaProducer;

    @Autowired
    public MainController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

   /* @PostMapping("/kafka-send-stub")
    public String kafka_send_stub(@RequestBody String body) {
        kafkaProducer.sendMessage("your-topic-name", "key", "Hello, world");
        return "OK";
    }*/

    @PostMapping("/C2c")
    public String kafka_send_stub(@RequestBody String body) {
        kafkaProducer.sendMessage("request-topic", "key", body);
        return "OK";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name;
    }

    @GetMapping("/home")
    public String home(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("-----> MAIN_PAGE");
        return "HOME PAGE";
    }

    @PostMapping("/posthello")
    public String posthello(@RequestBody String body) {
        System.out.println(body);
        return "posthello";
    }

}
