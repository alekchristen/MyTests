package io.reflectoring.demo.kafka;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "response-topic")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Received message:");
        System.out.println("Key: " + record.key());
        System.out.println("Value: " + record.value());
    }

}
