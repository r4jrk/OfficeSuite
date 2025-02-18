package com.r4jrk.r4officesuite;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Rate(String no, String effectiveDate, double mid) { }