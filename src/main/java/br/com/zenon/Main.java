package br.com.zenon;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static Logger logger = LoggerFactory.getLogger("Main");

    public static void main(String[] args) {

        var transactions = new TransactionIngestor().ingest("data\\PS_20174392719_1491204439457_log.csv");
        for (int j = 0; j <= 9; j++) {
            logger.info("line number {} - {}", j + 1, transactions.get(j).toString());
        }

    }
}
