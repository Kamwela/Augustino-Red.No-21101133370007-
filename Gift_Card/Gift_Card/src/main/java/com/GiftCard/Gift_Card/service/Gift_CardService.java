package com.GiftCard.Gift_Card.service;

import com.GiftCard.Gift_Card.entity.Gift_CardEntity;

import java.util.List;

public interface Gift_CardService {
    Gift_CardEntity createGift_Card(Gift_CardEntity gift_CardEntity);

    Gift_CardEntity getGift_CardById(Long gift_CardId);

    List<Gift_CardEntity> getAllGift_Card();

    Gift_CardEntity updateGift_Card(Gift_CardEntity gift_CardEntity);

    void deleteGift_Card(Long gift_CardId);
}
