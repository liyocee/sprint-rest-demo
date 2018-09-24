package com.liyosi.springrest.demo.api.domain;

import java.io.Serializable;

/**
 * Created by liyosi on Sep, 2018
 */
public class BillingCard implements Serializable {
  private String type;
  private String number;
  private String iban;
  private String swift;
  private ExpirationDate expirationDate;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public String getSwift() {
    return swift;
  }

  public void setSwift(String swift) {
    this.swift = swift;
  }

  public ExpirationDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(ExpirationDate expirationDate) {
    this.expirationDate = expirationDate;
  }
}
