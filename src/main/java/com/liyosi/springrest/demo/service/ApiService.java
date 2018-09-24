package com.liyosi.springrest.demo.service;

import com.liyosi.springrest.demo.api.domain.User;

import java.util.List;

/**
 * Created by liyosi on Sep, 2018
 */
public interface ApiService {

  List<User> getUsers(Integer limit);
}
