package com.customer.customer_account.cards.repository;

import com.customer.customer_account.cards.model.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardsRepository extends JpaRepository<Cards,Long> {

}
