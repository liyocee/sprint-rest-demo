package com.liyosi.springrest.demo.service;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liyosi on Sep, 2018
 */
public class RestTemplateExamples {

  public static final String API_ROOT = "https://api.predic8.de:443/shop";

  @Test
  public void getCustomers() throws Exception {

    String apiUrl = API_ROOT + "/customers/";

    RestTemplate restTemplate = new RestTemplate();

    JsonNode jsonNode = restTemplate.getForObject(apiUrl, JsonNode.class);

    System.out.println("Response is:");

    System.out.println(jsonNode.toString());

  }

  @Test
  public void createCustomer() throws Exception {
    String apiUrl = API_ROOT + "/customers/";
    RestTemplate restTemplate = new RestTemplate();

    Map<String, Object> postObj = new HashMap<>();

    postObj.put("firstname", "Joe");
    postObj.put("lastname", "Buck");

    JsonNode jsonNode = restTemplate.postForObject(apiUrl, postObj, JsonNode.class);

    System.out.println("Response is: ");
    System.out.println(jsonNode.toString());
  }
}
