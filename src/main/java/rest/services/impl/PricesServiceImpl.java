package rest.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.domain.Direction;
import rest.domain.PricesResponse;
import rest.domain.doa.PricesDao;
import rest.domain.doa.entity.Price;
import rest.services.PricesService;

import java.util.List;

/**
 * Created by User on 2016-10-22.
 */
@Service
public class PricesServiceImpl implements PricesService {

    @Autowired
    private PricesDao pricesDao;

    public PricesResponse getPricesByAreaId(int areaId, Direction direction) {
        List<Price> priceList = (Direction.FROM.equals(direction)) ? pricesDao.findByAreaIdAsDeparture(areaId) : pricesDao.findByAreaIdAsDestination(areaId);
        PricesResponse pricesResponse = new PricesResponse();
        for(Price price : priceList){
//            pricesResponse.set
        }
        return null;
    }

    public PricesResponse getPrice(int areaFromId, int areaToId) {
        return null;
    }
}
