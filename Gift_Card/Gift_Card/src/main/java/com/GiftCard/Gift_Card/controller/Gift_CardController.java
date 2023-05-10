package com.GiftCard.Gift_Card.controller;


import com.GiftCard.Gift_Card.entity.Gift_CardEntity;
import com.GiftCard.Gift_Card.service.Gift_CardService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/gift_Card")
public class Gift_CardController {

    private Gift_CardService gift_CardService;

    @PostMapping
    public ResponseEntity<Gift_CardEntity> createGift_Card(Gift_CardEntity gift_cardEntity) {
        Gift_CardEntity savedGift_Card = gift_CardService.createGift_Card(gift_cardEntity);
        return new ResponseEntity<>(gift_cardEntity, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Gift_CardEntity>> getAllGift_Card(){
        List<Gift_CardEntity> gift_CardEntities = gift_CardService.getAllGift_Card();
        return new ResponseEntity<>(gift_CardEntities, HttpStatus.OK);

    }

    @PutMapping("{id}")
    public ResponseEntity<Gift_CardEntity> updateGift_CardEntity(@PathVariable("id")Long gitf_CardId,@RequestParam Gift_CardEntity gift_CardEntity){
        gift_CardEntity.setId(gitf_CardId);
        Gift_CardEntity updateGift_CardEntity = gift_CardService.updateGift_Card(gift_CardEntity);
        return new ResponseEntity<>(updateGift_CardEntity, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteGift_CardEntity(@PathVariable("id")Long gift_CardId){
        gift_CardService.deleteGift_Card(gift_CardId);
        return new ResponseEntity<>( "Gift Card detail successifully deleted", HttpStatus.OK);
    }


}
