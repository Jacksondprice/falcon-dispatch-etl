package com.falcondispatchetl;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
  @GetMapping
  public List<String> list() {
    return List.of("sample");
  }
}
