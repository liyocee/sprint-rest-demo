package com.liyosi.springrest.demo.service;

import com.liyosi.springrest.demo.api.domain.User;
import com.liyosi.springrest.demo.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by liyosi on Sep, 2018
 */
@Service
public class ApiServiceImpl implements ApiService {

  private final RestTemplate restTemplate;

  public ApiServiceImpl(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public List<User> getUsers(Integer limit) {
    UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);
    return userData.getData();
  }
}
