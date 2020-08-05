package com.techelevator.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.Address;

@Component
public class AddressSqlDao implements AddressDao {

	private JdbcTemplate template;

	public AddressSqlDao(DataSource datasource) {

		this.template = new JdbcTemplate(datasource);

	}

	@Override
	public Address getAddressById(int addressId) {
		
		Address address = new Address();

		String sqlAddress = "SELECT * FROM address WHERE address_id = ?";

		SqlRowSet result = template.queryForRowSet(sqlAddress, addressId);
		if (result.next()) {
			address = mapResultToAddress(result);
		}
		return address;
	}

	private Address mapResultToAddress(SqlRowSet result) {

		int addressId = result.getInt("address_id");
		String street = result.getString("street");
		String suite = result.getString("suite");
		String city = result.getString("city");
		String region = result.getString("region");
		String postal = result.getString("postal");
		String country = result.getString("country");

		Address retrievedAddress = new Address(addressId, street, suite, city, region, postal, country);

		return retrievedAddress;

	}

}
