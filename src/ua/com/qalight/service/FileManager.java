package ua.com.qalight.service;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;

import ua.com.qalight.entity.Currency;
import ua.com.qalight.entity.CurrencyEntity;


public class FileManager {
	
	private static final String INPUT_FILE_PATH = 
			System.getProperty("user.dir") + 
			System.getProperty("file.separator") + 
			"files" + 
			System.getProperty("file.separator") + 
			"inputFile.txt";	

	private static final String OUTPUT_FILE_PATH = 
			System.getProperty("user.dir") + 
			System.getProperty("file.separator") + 
			"files" + 
			System.getProperty("file.separator") + 
			"outputFile.txt";

	

	private static CharBuffer currencyMap;	

	public static Map<String, Double> readInputCurrencyValues(){
		
			
		try (FileReader fileReader = new FileReader(INPUT_FILE_PATH);
				BufferedReader bufferedReader = new BufferedReader(fileReader);){
			
			String line = "";
			while((line = bufferedReader.readLine()) != null) {
				String[] words = line.split(",");
				String currency = words[0];
				double value = Double.parseDouble(words[1]);
				CurrencyEntity currencyEntity = new CurrencyEntity(currency, value);
		} 
		}catch (Exception e) {
						
			e.printStackTrace();
		}

		return null;
	}
	
	public static void writeCurrencyValuesToFile(CurrencyEntity currency) {
		try (FileWriter fileWriter = new FileWriter(OUTPUT_FILE_PATH)){
			fileWriter.write(currency.toString() + currencyMap + "\n");
			fileWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

		
		
	

} 