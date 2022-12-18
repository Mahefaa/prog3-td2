package com.prog3.prog3td2.controller;

import com.prog3.prog3td2.model.Sponsor;
import com.prog3.prog3td2.service.SponsorService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SponsorController {
  private final SponsorService service;

  @GetMapping("/sponsors")
  public List<Sponsor> findAll() {
    return service.findAll();
  }
}
