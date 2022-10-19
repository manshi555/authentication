package com.java.authentication.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.java.authentication.model.ResponseData;


@Repository
public class CommonFunctionalityRepo {

	private JdbcTemplate jdbcTemplate;

	private String query = "SELECT a.agent_name, c.client_name, max(c.total_bill) from agency a JOIN agency_list_of_clients l ON a.agent_id = l.agency_agent_id JOIN Client c ON c.client_id = l.list_of_clients_client_id";

	@Autowired
	public void setDataSource(@Qualifier("dataSource")  DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public ResponseData findTopClient() {
		return jdbcTemplate.queryForObject(query, new RowMapper<ResponseData>() {
			@Override
		    public ResponseData mapRow(ResultSet resultset, int rowNum) throws SQLException {
			ResponseData responseData = new ResponseData();
			responseData.setAgentName(resultset.getString(1));
			responseData.setClientName(resultset.getString(2));
			responseData.setTotalBill(resultset.getDouble(3));
			return responseData;
		}
		});
	}
}
