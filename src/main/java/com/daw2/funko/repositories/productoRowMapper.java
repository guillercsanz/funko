package com.daw2.funko.repositories;


import com.daw2.funko.models.producto;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component

public class productoRowMapper  implements RowMapper<producto> {


    @Override
    public producto mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new producto(
                rs.getLong("id"),
                rs.getString("nombre"),
                rs.getString("desc"),
                rs.getBigDecimal("precio"),
                rs.getInt("unidades"));

    }
}
