package com.redbee.weatherservice.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ForecastResponse {

  @JsonProperty("location")
  private Location location;

  @JsonProperty("units")
  private Units units;

  @JsonProperty("image")
  private Image image;

  @JsonCreator
  public ForecastResponse(@JsonProperty("location") Location location,
      @JsonProperty("units") Units units,
      @JsonProperty("image") Image image) {
    this.location = location;
    this.units = units;
    this.image = image;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Units getUnits() {
    return units;
  }

  public void setUnits(Units units) {
    this.units = units;
  }

  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }
}
