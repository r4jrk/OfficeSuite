package com.r4jrk.r4officesuite;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ExchangeRatesController {

    @GetMapping("/exchangerates")
    public String getExchangeRates() {
        //model.addAttribute("name", name);
	    return "exchangerates";
	}
}