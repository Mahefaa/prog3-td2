package com.prog3.prog3td2.controller;

import com.prog3.prog3td2.model.Player;
import com.prog3.prog3td2.service.PlayerService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PlayerController {
  private final PlayerService service;
  @GetMapping("/players")
  public List<Player> findAll() {
    return service.findAll();
  }
}
