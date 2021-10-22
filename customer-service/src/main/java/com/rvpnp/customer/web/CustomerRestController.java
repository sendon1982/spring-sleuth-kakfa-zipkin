package com.rvpnp.customer.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.rvpnp.customer.web.KafkaMessageListener.EVENT_TOPIC;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class CustomerRestController {

    private static final String ORDER_SERVICE_HOST = "http://localhost:9082";

    private final KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/customer/11041032/orders")
    public ResponseEntity<String> getOrderDetail() {
        log.info("Calling webhook at customer-service");

        kafkaTemplate.send(EVENT_TOPIC, "message-key", "message-body");
        log.info("Publish message into topic {}", EVENT_TOPIC);

        return ResponseEntity.ok("success");
    }
}
