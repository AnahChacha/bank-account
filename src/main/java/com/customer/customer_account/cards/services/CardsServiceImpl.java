package com.customer.customer_account.cards.services;

import com.customer.customer_account.cards.dto.CardsDto;
import com.customer.customer_account.cards.model.Cards;
import com.customer.customer_account.cards.repository.CardsRepository;
import com.customer.customer_account.customer.model.Customer;
import com.customer.customer_account.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardsServiceImpl implements CardsService{
    private final CardsRepository cardsRepository;
    private final CustomerRepository customerRepository;

    @Override
    public Cards createCards(CardsDto cardsDto) {
        Customer customer=customerRepository.findByEmail(cardsDto.getEmail()).orElseThrow(() -> new RuntimeException("not found"));

        Cards cards=new Cards();
        cards.setCreditNo(cardsDto.getCreditNo());
        cards.setDebitNo(cardsDto.getDebitNo());
        cards.setCustomer(customer);
        return cardsRepository.save(cards);
    }

    @Override
    public List<Cards> getAllCards() {
        return cardsRepository.findAll();
    }
}
