package rest.services;

import rest.domain.Direction;
import rest.domain.PricesResponse;

/**
 * Created by User on 2016-10-22.
 */
public interface PricesService {

    /**
     * Returns prices by area id as the from location or to location based on the direction
     *
     * @param areaId
     * @param direction
     * @return
     */
    PricesResponse getPricesByAreaId(int areaId, Direction direction);

    /**
     * Returns the price from one place to another
     *
     * @param areaFromId
     * @param areaToId
     * @return
     */
    PricesResponse getPrice(int areaFromId, int areaToId);


}
