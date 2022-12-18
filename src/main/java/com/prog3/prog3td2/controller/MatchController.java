package com.prog3.prog3td2.controller;

import com.prog3.prog3td2.model.Match;
import com.prog3.prog3td2.service.MatchService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MatchController {
  private final MatchService service;

  @GetMapping("/matches")
  public List<Match> findAll() {
    return service.findAll();
  }
}
