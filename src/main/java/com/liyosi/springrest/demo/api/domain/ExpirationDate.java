package com.liyosi.springrest.demo.api.domain;

import java.io.Serializable;

/**
 * Created by liyosi on Sep, 2018
 */
public class ExpirationDate implements Serializable {

  private String date;
  private Integer timezoneType;
  private String timezone;

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Integer getTimezoneType() {
    return timezoneType;
  }

  public void setTimezoneType(Integer timezoneType) {
    this.timezoneType = timezoneType;
  }

  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }
}
