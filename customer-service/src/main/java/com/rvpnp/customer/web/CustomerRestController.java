package com.rvpnp.customer.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class CustomerRestController {

  private static final String SYSTEM_ID_STORE_HOST = "http://localhost:9082";
  private static final String BAAP_ONBOARD_HOST = "http://localhost:9083";

  private final RestTemplate restTemplate;

  @GetMapping("/webhook")
  public ResponseEntity<String> callWebhook() {
    log.info("Calling webhook at capital-app");

    restTemplate.getForEntity(SYSTEM_ID_STORE_HOST + "/identifiers/capital-id/adb200dd5883", String.class);
    log.info("Calling SYSTEM_ID_STORE {} from capital-app", SYSTEM_ID_STORE_HOST);

    return  ResponseEntity.ok("success");
  }

  @GetMapping("/result")
  public void getResult() {
    log.info("Calling getResult at capital-app and whole process is DONE");
  }
}
