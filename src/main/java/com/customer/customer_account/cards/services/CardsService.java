package com.customer.customer_account.cards.services;

import com.customer.customer_account.cards.dto.CardsDto;
import com.customer.customer_account.cards.model.Cards;

import java.util.List;

public interface CardsService {
    Cards createCards(CardsDto cardsDto);

    List<Cards>getAllCards();
}
