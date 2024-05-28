package com.mockyBack.demo;

import com.mockyBack.demo.services.CSVReaderService	;
import com.mockyBack.demo.entities.DefaultPlans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class MockyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockyBackendApplication.class, args);
	}

	/*CSVReader csvReader = new CSVReader();
	InputStream inputStream = getClass().getResourceAsStream("/TarificationRC.csv");
	List<DefaultPlans> defaultPlansList = csvReader.readCSV(inputStream);*/

}
