package br.com.zenon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static Logger logger = LoggerFactory.getLogger("Main");

    public static void main(String[] args) {

        Transaction transaction1 = new Transaction(1, TransactionType.PAYMENT, 9839.64, "C1231006815", 170136.0,
                160296.36, "M1979787155",
                0.0, 0.0, 0, 0);

        Transaction transaction2 = new Transaction(743, TransactionType.CASH_OUT, 850002.52, "C1280323807", 850002.52,
                0.0, "C873221189", 6510099.11, 7360101.63, 1, 0);

        logger.info(transaction1.toString());
        logger.info(transaction2.toString());



        TransactionIngestor transactionIngestor = new TransactionIngestor();
        transactionIngestor.ingest("data\\PS_20174392719_1491204439457_log.csv");

    }
}
