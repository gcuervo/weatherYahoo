package com.redbee.weatherservice.web;

import com.redbee.weatherservice.bean.ForecastResponse;
import com.redbee.weatherservice.model.Board;
import com.redbee.weatherservice.service.WeatherService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/boards")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BoardResource {

  @Autowired
  private WeatherService yahooWeatherService;

  @GET
  @Path("/{userName}/{boardName}")
  public String getWeatherOfBoard(@PathParam("userName") String username,
      @PathParam("boardName") String boardName) {

    return yahooWeatherService.getForecast("");
  }

  @GET
  public List<Board> getAllBoards() {
    return null;
  }
}
