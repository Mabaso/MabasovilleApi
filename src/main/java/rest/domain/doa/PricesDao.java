package rest.domain.doa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import rest.domain.doa.entity.Price;
import rest.domain.doa.mappers.PricesMapper;

import java.util.HashMap;
import java.util.List;

/**
 * Created by User on 2016-10-22.
 */
@Repository
public class PricesDao {

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Price> findByAreaIdAsDestination(int areaId) {
        List<Price> prices = namedParameterJdbcTemplate.query("select * from prices where area_to = " + areaId, new HashMap<String, Object>(), new PricesMapper());
        return prices;
    }

    public List<Price> findByAreaIdAsDeparture(int areaId) {
        List<Price> prices = namedParameterJdbcTemplate.query("select * from prices where area_from = " + areaId, new HashMap<String, Object>(), new PricesMapper());
        return prices;
    }

}
