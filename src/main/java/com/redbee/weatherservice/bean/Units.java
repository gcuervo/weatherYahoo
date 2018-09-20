package com.redbee.weatherservice.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Units {

  @JsonProperty("distance")
  private String distance;

  @JsonProperty("pressure")
  private String pressure;

  @JsonProperty("speed")
  private String speed;

  @JsonProperty("temperature")
  private String temperature;

  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public String getPressure() {
    return pressure;
  }

  public void setPressure(String pressure) {
    this.pressure = pressure;
  }

  public String getSpeed() {
    return speed;
  }

  public void setSpeed(String speed) {
    this.speed = speed;
  }

  public String getTemperature() {
    return temperature;
  }

  public void setTemperature(String temperature) {
    this.temperature = temperature;
  }
}
