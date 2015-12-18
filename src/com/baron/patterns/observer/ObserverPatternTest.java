package com.baron.patterns.observer;

import com.baron.patterns.observer.observer.CurrentConditionsDisplay;
import com.baron.patterns.observer.observer.ForecastDisplay;
import com.baron.patterns.observer.subject.WeatherData;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟一个气象站（测试类）
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @see com.baron.patterns.observer.subject.WeatherData
 * @see com.baron.patterns.observer.observer.CurrentConditionsDisplay
 * @see com.baron.patterns.observer.observer.ForecastDisplay
 * @since 1.0
 */
public class ObserverPatternTest {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        List<Float> forecastTemperatures = new ArrayList<Float>();
        forecastTemperatures.add(22f);
        forecastTemperatures.add(-1f);
        forecastTemperatures.add(9f);
        forecastTemperatures.add(23f);
        forecastTemperatures.add(27f);
        forecastTemperatures.add(30f);
        forecastTemperatures.add(10f);
        weatherData.setMeasurements(22f, 0.8f, 1.2f, forecastTemperatures);

        System.out.println("============================================");

        List<Float> forecastTemperatures2 = new ArrayList<Float>();
        forecastTemperatures2.add(2f);
        forecastTemperatures2.add(9f);
        forecastTemperatures2.add(9f);
        forecastTemperatures2.add(13f);
        forecastTemperatures2.add(17f);
        forecastTemperatures2.add(20f);
        forecastTemperatures2.add(20f);
        weatherData.setMeasurements(2f, 0.7f, 1.1f, forecastTemperatures2);

        System.out.println("============================================");

        List<Float> forecastTemperatures3 = new ArrayList<Float>();
        forecastTemperatures3.add(21f);
        forecastTemperatures3.add(11f);
        forecastTemperatures3.add(12f);
        forecastTemperatures3.add(33f);
        forecastTemperatures3.add(37f);
        forecastTemperatures3.add(30f);
        forecastTemperatures3.add(20f);
        weatherData.setMeasurements(21f, 0.6f, 0.9f, forecastTemperatures3);
    }
}
