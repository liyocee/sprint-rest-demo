package com.liyosi.springrest.demo.api.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liyosi on Sep, 2018
 */
public class UserData implements Serializable {

  private List<User> data;

  public List<User> getData() {
    return data;
  }

  public void setData(List<User> data) {
    this.data = data;
  }
}
