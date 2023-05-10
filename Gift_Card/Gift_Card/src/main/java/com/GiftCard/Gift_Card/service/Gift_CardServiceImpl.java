package com.GiftCard.Gift_Card.service;

import com.GiftCard.Gift_Card.entity.Gift_CardEntity;
import com.GiftCard.Gift_Card.repository.Gift_CardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class Gift_CardServiceImpl implements Gift_CardService {
    private Gift_CardRepository gift_CardRepository;
    @Override
    public Gift_CardEntity createGift_Card(Gift_CardEntity gift_CardEntity) {
        return gift_CardRepository.save(gift_CardEntity);
    }

    @Override
    public Gift_CardEntity getGift_CardById(Long gift_CardId) {
        Optional<Gift_CardEntity> optionalGift_CardEntity = gift_CardRepository.findById(gift_CardId);
        return optionalGift_CardEntity.get();
    }

    @Override
    public List<Gift_CardEntity> getAllGift_Card() {
        return gift_CardRepository.findAll();
    }

    @Override
    public Gift_CardEntity updateGift_Card(Gift_CardEntity gift_CardEntity) {
        Gift_CardEntity existingGift_Card = gift_CardRepository.findById(gift_CardEntity.getId()).get();
        existingGift_Card.setValue(gift_CardEntity.getValue());
        existingGift_Card.setValidate(gift_CardEntity.getValidate());
        existingGift_Card.setType(gift_CardEntity.getType());
        existingGift_Card.setActivation_status(gift_CardEntity.getActivation_status());
        existingGift_Card.setPaymentMode(gift_CardEntity.getPaymentMode());
        return null;
    }

    @Override
    public void deleteGift_Card(Long gift_CardId) {
        gift_CardRepository.deleteById(gift_CardId);

    }
}
