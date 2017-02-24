package rest.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.domain.Direction;
import rest.domain.PricesResponse;
import rest.services.PricesService;

/**
 * Created by User on 2016-10-22.
 */
@RestController
@RequestMapping("/prices")
public class PricesEndpoint {

    @Autowired
    private PricesService pricesService;

    @GetMapping("from/{areaId}")
    public PricesResponse getFromPricesById(@PathVariable int areaId) {
        return pricesService.getPricesByAreaId(areaId, Direction.FROM);
    }

    @GetMapping("to/{areaId}")
    public PricesResponse getToPricesById(@PathVariable int areaId) {
        return pricesService.getPricesByAreaId(areaId, Direction.TO);
    }

    @GetMapping("/{areaFromId}/{areaToId}")
    public PricesResponse getPrice(@PathVariable int areaFromId, @PathVariable int areaToId) {
        return pricesService.getPrice(areaFromId, areaToId);
    }
}
