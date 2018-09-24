package com.liyosi.springrest.demo.service;

import com.liyosi.springrest.demo.api.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by liyosi on Sep, 2018
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ApiServiceImplTest {

  @Autowired
  ApiService apiService;


  @Test
  public void testGetUsers() throws Exception {
    List<User> users = apiService.getUsers(3);

    log.info("users" + users);
    assertEquals(3 + 1, users.size());
  }
}
