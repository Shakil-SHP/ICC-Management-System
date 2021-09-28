package com.shakil.repository;

import com.shakil.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeriesRepository  extends JpaRepository<Series, Long> {
//    List<Series> allSeries();
//    void addSeries(Series series);
//    Series getSeriesByName(String seriesName);
//    Series getSeriesById(Long seriesId);
//    Series updateSeries(Series series);
}
