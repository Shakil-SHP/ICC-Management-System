package com.shakil.repository;

import com.shakil.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository  extends JpaRepository<Event, Long> {

//    List<Event> allEvents();
//    Event getEventById(String id);
//    void addEvent(Event event);
//    void updateEvent(Event event);

}
