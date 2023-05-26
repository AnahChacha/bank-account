package com.customer.customer_account.cards.controller;

import com.customer.customer_account.cards.dto.CardsDto;
import com.customer.customer_account.cards.model.Cards;
import com.customer.customer_account.cards.services.CardsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/")
public class CardsController {
    private final CardsService cardsService;

    @PostMapping(value = "/createCards")
    public ResponseEntity<Cards>createCards(@RequestBody CardsDto cardsDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(cardsService.createCards(cardsDto));
    }

    @GetMapping(value = "/getAllCards")
    public ResponseEntity<List<Cards>>getAllCards(){
        return ResponseEntity.ok(cardsService.getAllCards());
    }

}
