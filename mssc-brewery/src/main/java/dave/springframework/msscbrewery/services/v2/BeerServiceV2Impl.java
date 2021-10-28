package dave.springframework.msscbrewery.services.v2;

import dave.springframework.msscbrewery.web.model.BeerDto;
import dave.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import dave.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Good People")
                .beerStyle(BeerStyleEnum.STOUT)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        // todo impl - woould add a real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer {}");
        // todo impl - would add a real impl to delete beer
    }
}
