package rest.domain.doa.mappers;


import org.springframework.jdbc.core.RowMapper;
import rest.domain.doa.entity.Areas;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by User on 2016-10-21.
 */
public class AreasMapper implements RowMapper<Areas> {
    public Areas mapRow(ResultSet resultSet, int i) throws SQLException {
        Areas areas = new Areas();
        areas.setDescription(resultSet.getString("description"));
        areas.setId(resultSet.getInt("id"));
        areas.setEffective_from(resultSet.getDate("effective_from"));
        areas.setEffective_to(resultSet.getDate("effective_to"));
        return areas;
    }
}
