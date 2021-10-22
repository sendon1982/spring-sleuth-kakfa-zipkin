package com.rvpnp.product.web;

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
public class BaapOnboardRestController {

  private static final String CAPITAL_APP_HOST = "http://localhost:9081";

  private final RestTemplate restTemplate;

  @GetMapping("/v3/customer/email")
  public void getCustomerEmail() throws InterruptedException {
    log.info("Calling getCustomerEmail at baap-onboard");

    Thread.sleep(3000);

    restTemplate.getForEntity(CAPITAL_APP_HOST + "/result", String.class);
    log.info("Calling CAPITAL_APP_HOST {} from baap-onboard", CAPITAL_APP_HOST);
  }
}
