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

  private static final String CAPITAL_APP_HOST = "http://localhost:9081";
  private static final String BAAP_ONBOARD_HOST = "http://localhost:9083";

  private final RestTemplate restTemplate;

  @GetMapping("/identifiers/capital-id/adb200dd5883")
  public void getBrandCapitalId() throws InterruptedException {
    log.info("Calling getBrandCapitalId at system-id-store");

    Thread.sleep(1000);

    restTemplate.getForEntity(BAAP_ONBOARD_HOST + "/v3/customer/email", String.class);
    log.info("Calling BAAP_ONBOARD {} from system-id-store", BAAP_ONBOARD_HOST);
  }
}
