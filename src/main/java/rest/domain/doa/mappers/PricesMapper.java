package rest.domain.doa.mappers;

import org.springframework.jdbc.core.RowMapper;
import rest.domain.doa.entity.Price;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by User on 2016-10-23.
 */
public class PricesMapper implements RowMapper<Price> {
    public Price mapRow(ResultSet resultSet, int i) throws SQLException {
        Price prices = new Price();
        prices.setEffective_from(resultSet.getDate("effective_from"));
        prices.setEffective_to(resultSet.getDate("effective_to"));
        prices.setArea_to(resultSet.getInt("area_to"));
        prices.setArea_from(resultSet.getInt("area_from"));
        prices.setPrice(resultSet.getFloat("price"));
        prices.setRank_id(resultSet.getInt("rank_id"));
        prices.setId(resultSet.getInt("id"));
        return prices;
    }
}
