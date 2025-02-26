package com.r4jrk.r4officesuite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExchangeRatesRestController {

	private static final Logger log = LoggerFactory.getLogger(NbpApiClient.class);

    @Autowired
    private NbpApiClient exchangeRatesClient;

    @GetMapping("/exchangerates")
    public NbpApiResponse getExchangeRates(Model model) {
        log.info("I'm in EchangeRatesRestControllerze");
        NbpApiResponse nbpApiResponse = exchangeRatesClient.getExchangeRates();
        log.info(nbpApiResponse.toString());
        return nbpApiResponse;
	}
}