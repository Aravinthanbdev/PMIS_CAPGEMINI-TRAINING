package com.quickrelief.model;
public record SupplyRequest(Long id, String itemName, int quantity, String status, String requestedBy) {}
