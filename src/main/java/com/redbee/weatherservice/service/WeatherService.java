package com.redbee.weatherservice.service;

import com.redbee.weatherservice.bean.ForecastResponse;

public interface WeatherService {
  String getForecast(String city);
}
