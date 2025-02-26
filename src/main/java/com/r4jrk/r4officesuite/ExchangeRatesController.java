package com.r4jrk.r4officesuite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExchangeRatesController {

    @GetMapping("/exchangerates")
    public String getExchangeRates() {
        //model.addAttribute("name", name);
	    return "exchangerates";
	}
}