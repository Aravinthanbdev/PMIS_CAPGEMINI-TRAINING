package com.quickrelief.dto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
public record CreateRequest(@NotBlank(message="itemName is required") String itemName,
                            @Min(value=1, message="quantity must be at least 1") int quantity,
                            @NotBlank(message="requestedBy is required") String requestedBy) {}
