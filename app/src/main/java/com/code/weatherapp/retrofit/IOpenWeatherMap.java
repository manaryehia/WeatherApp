package com.code.weatherapp.retrofit;



import com.code.weatherapp.model.WeatherForecastResult;
import com.code.weatherapp.model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {

    @GET("weather")
    Observable<WeatherResult> getWeatherBylating(@Query("lat") String lat, @Query("lon") String lon,
    @Query("appid") String appid,@Query("units") String unit);

    @GET("weather")
    Observable<WeatherResult> getWeatherByCityName(@Query("q") String cityName,
                                                 @Query("appid") String appid,@Query("units") String unit);

    @GET("forecast")
    Observable<WeatherForecastResult> getForecastWeatherBylating(@Query("lat") String lat, @Query("lon") String lon,
                                                                 @Query("appid") String appid, @Query("units") String unit);

}
