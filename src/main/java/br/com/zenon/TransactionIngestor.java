package br.com.zenon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransactionIngestor {

    Logger logger = LoggerFactory.getLogger("TransactionIngestor");

    public List<Transaction> ingest(String fileName) {

        try (FileReader fileReader = new FileReader(fileName)) {
            logger.info("Ingesting data....");

            List<Transaction> transactions = new ArrayList<>();

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            for (int i = 0; i < 1001; i++) {
                var split = bufferedReader.readLine().split(",");
                if (i == 0)
                    continue;
                var step = Integer.valueOf(split[0]);
                var type = TransactionType.valueOf(split[1]);
                var amount = Float.valueOf(split[2]);
                var nameOrig = split[3];
                var oldbalanceOrg = Float.valueOf(split[4]);
                var newbalanceOrig = Float.valueOf(split[5]);
                var nameDest = split[6];
                var oldbalanceDest = Float.valueOf(split[7]);
                var newbalanceDest = Float.valueOf(split[8]);
                var isFraud = Integer.valueOf(split[9]);
                var isFlaggedFraud = Integer.valueOf(split[10]);

                var transaction = new Transaction(step, type, amount, nameOrig, oldbalanceOrg, newbalanceOrig, nameDest,
                        oldbalanceDest, newbalanceDest, isFraud, isFlaggedFraud);

                transactions.add(transaction);
            }

            return transactions;

        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        
        return List.of();
    }

}
