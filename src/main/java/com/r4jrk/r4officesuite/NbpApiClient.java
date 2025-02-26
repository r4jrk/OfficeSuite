package com.r4jrk.r4officesuite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class NbpApiClient {
    
    private final WebClient webClient;

    public NbpApiClient(WebClient.Builder webClientBuilder) {
        this.webClient = 
            webClientBuilder
                .baseUrl("http://api.nbp.pl/api/exchangerates/rates/a/EUR/2025-01-15/?format=json").build();
    }

	private static final Logger log = LoggerFactory.getLogger(NbpApiClient.class);

    public NbpApiResponse getExchangeRates() {
        log.info("ExchangeRatesClient.getExchangeRates()");
        return webClient.get()
                // .uri(uriBuilder -> uriBuilder
                //         .path("/greet")
                //         .queryParam("name", name)
                //         .build())
                .retrieve()
                .bodyToMono(NbpApiResponse.class)
                .block(); // Synchronous, blocks until result is received
    }
}