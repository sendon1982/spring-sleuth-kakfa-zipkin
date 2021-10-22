package com.rvpnp.order.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class OrderRestController {

    private static final String PRODUCT_SERVICE_HOST = "http://localhost:9083";

    private final RestTemplate restTemplate;

    @GetMapping("/orders/b200dc5873")
    public void getOrderDetailInfo() throws InterruptedException {
        log.info("Calling getOrderDetailInfo at order-service");

        Thread.sleep(1000);

        restTemplate.getForEntity(PRODUCT_SERVICE_HOST + "/products/123", String.class);
        log.info("Calling PRODUCT_SERVICE_HOST {} from order-service", PRODUCT_SERVICE_HOST);
    }
}
