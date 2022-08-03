package com.mdartifact.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
