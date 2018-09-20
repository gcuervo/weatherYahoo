package com.redbee.weatherservice.service;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class YahooWeatherServiceImpl implements WeatherService {

  private UriComponentsBuilder urlbuilder;

  @PostConstruct
  protected void init() {
    urlbuilder = UriComponentsBuilder.newInstance()
        .scheme("https")
        .host("query.yahooapis.com")
        .path("/v1/public/yql");
  }

  @Override
  public String getForecast(String city) {
    String query = "select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"nome, ak\")";
    String url = urlbuilder.replaceQueryParam("q", query).queryParam("format", "json").build()
        .toUriString();

    RestTemplate restTemplate = new RestTemplate();
    String forecastResponse = restTemplate.getForObject(url, String.class);
    return forecastResponse;
  }
}
