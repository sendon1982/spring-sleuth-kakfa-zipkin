package com.rvpnp.product.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class ProductRestController {

    @GetMapping("/products/123")
    public void getProductInfo() throws InterruptedException {
        Thread.sleep(3000);

        log.info("Calling getProductInfo at product-service");
    }
}
