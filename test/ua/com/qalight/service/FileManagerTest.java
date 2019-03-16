package ua.com.qalight.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import ua.com.qalight.entity.CurrencyEntity;


class FileManagerTest {

	@Test
			
		void testWriteAndReadCurrentyInFile() {

			Map<String, Double> currencyMap = FileManager.readInputCurrencyValues();
			
			FileManager.writeCurrencyValuesToFile(currencyMap);
			
			assertTrue(currencyMap != null);
			
			assertEquals(value, currencyMap.get(0));
			
	}

}
