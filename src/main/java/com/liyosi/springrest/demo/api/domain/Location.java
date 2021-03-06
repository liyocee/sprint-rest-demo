package com.liyosi.springrest.demo.api.domain;

import java.io.Serializable;

/**
 * Created by liyosi on Sep, 2018
 */
public class Location implements Serializable {
  private String street;
  private String city;
  private String state;
  private String postCode;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

}
