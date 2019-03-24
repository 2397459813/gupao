package com.liu.template1;

import java.sql.ResultSet;

public interface RowMapper<T> {
  T mapRow(ResultSet rs, int rowNum) throws Exception;
}
