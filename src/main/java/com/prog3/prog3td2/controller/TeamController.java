package com.prog3.prog3td2.controller;

import com.prog3.prog3td2.model.Team;
import com.prog3.prog3td2.service.TeamService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TeamController {
  private final TeamService service;

  @GetMapping("/teams")
  public List<Team> findAll() {
    return service.findAll();
  }
}
