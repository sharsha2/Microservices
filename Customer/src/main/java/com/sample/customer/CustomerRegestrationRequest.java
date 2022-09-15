package com.sample.customer;

public record CustomerRegestrationRequest(String firstName,
                                          String lastName,
                                          String email) {
}
