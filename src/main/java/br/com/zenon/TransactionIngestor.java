package br.com.zenon;

import java.util.List;
import java.io.FileReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransactionIngestor {

    Logger logger = LoggerFactory.getLogger("TransactionIngestor");

    public TransactionIngestor(){}
    
    public List<Transaction> ingest(String fileName){
        
        try (FileReader fileReader = new FileReader(fileName)) {
            List<String> lines = fileReader.readAllLines();
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        return List.of();
    }
    
}
