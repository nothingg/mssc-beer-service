package guru.springframework.msscbeerservice.inventory;

import guru.springframework.msscbeerservice.services.inventory.BeerInventoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@Disabled // utility for manual testing
@SpringBootTest
class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @BeforeEach
    void setUp() {

    }

    @Test
    void getOnhandInventory() {

        UUID uid = UUID.fromString("a712d914-61ea-4623-8bd0-32c0f654bfd");
        //todo evolve to use UPC
        Integer qoh = beerInventoryService.getOnhandInventory(uid);

        System.out.println(qoh);

    }
}