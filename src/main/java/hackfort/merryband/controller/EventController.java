package hackfort.merryband.controller;

import org.springframework.web.bind.annotation.*;

import hackfort.merryband.model.Event;

@RestController
@RequestMapping("/events")
public class EventController {
  
  @RequestMapping(value = "/getEvent", method = RequestMethod.GET)
  public Event findEvent() {
    return new Event("jogging", "Downtown Park");
  }
}
