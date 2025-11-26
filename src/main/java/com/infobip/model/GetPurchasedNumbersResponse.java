package com.infobip.model;

import java.util.List;

public class GetPurchasedNumbersResponse {
    private int numberCount;
    private List<Number> numbers;

    // Getters and setters

    public static class Number {
        private boolean additionalSetupRequired;
        private String applicationId;
        private String entityId;
        private List<String> capabilities;
        private String country;
        private String countryName;
        private EditPermissions editPermissions;
        private List<String> keywords;
        private String network;
        private String note;
        private String number;
        private String numberKey;
        private Price price;
        private boolean shared;
        private String type;

        // Getters and setters
    }
}
