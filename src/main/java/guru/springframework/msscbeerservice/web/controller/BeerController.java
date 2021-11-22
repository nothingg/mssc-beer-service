package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.services.BeerSerivce;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("api/v1/beer")
@RestController
public class BeerController {

    public final BeerSerivce beerSerivce;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(beerSerivce.getById(beerId) , HttpStatus.OK) ;
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody @Validated BeerDto beerDto){

        return new ResponseEntity(beerSerivce.saveNewBeer(beerDto) , HttpStatus.CREATED) ;
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId , @RequestBody @Validated BeerDto beerDto ){
        return new ResponseEntity<>(beerSerivce.updateBeer(beerId,beerDto) , HttpStatus.NO_CONTENT);

    }


}
