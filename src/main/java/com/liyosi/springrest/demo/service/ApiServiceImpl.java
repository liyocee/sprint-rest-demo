package com.liyosi.springrest.demo.service;

import com.liyosi.springrest.demo.api.domain.User;
import com.liyosi.springrest.demo.api.domain.UserData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by liyosi on Sep, 2018
 */
@Service
public class ApiServiceImpl implements ApiService {

  private final RestTemplate restTemplate;
  private final String apiUrl;

  public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String apiUrl) {
    this.restTemplate = restTemplate;
    this.apiUrl = apiUrl;
  }

  @Override
  public List<User> getUsers(Integer limit) {
    UriComponentsBuilder urlBuilder = UriComponentsBuilder
        .fromUriString(apiUrl)
        .queryParam("limit", limit);

    UserData userData = restTemplate.getForObject(urlBuilder.toUriString(), UserData.class);
    return userData.getData();
  }
}
