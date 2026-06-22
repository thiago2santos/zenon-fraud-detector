package br.com.zenon;

public record Transaction(
    Integer step,
    TransactionType type,
    Float amount,
    String nameOrig,
    Float oldbalanceOrg,
    Float newbalanceOrig,
    String nameDest,
    Float oldbalanceDest,
    Float newbalanceDest,
    Integer isFraud,
    Integer isFlaggedFraud
) {}