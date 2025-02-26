package com.r4jrk.r4officesuite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

//TODO: Add Swagger, Add cachowanie w mongodb (ale też w springu kalkulacje) - czy może pobierać dane dla wszystkich walut 
//i zapisywać w bazie, a potem tylko pobierać z bazy?
//Add swagger, jUnit testys
//Add reklamy, Add sugestie featurów, Add kontakt, Add legal, Add download standalone apek,
//Add async web client, add nginx
///docker-compose
// Add drukowanie (optional, możę kiedyś)

// package com.github.gdl;

// import io.swagger.v3.oas.annotations.OpenAPIDefinition;
// import io.swagger.v3.oas.annotations.info.Info;
// import io.swagger.v3.oas.annotations.info.License;

// @OpenAPIDefinition(
//         info = @Info(
//                 title = "Direct print service",
//                 description = "Direct print to client local printer API Documentation",
//                 version = "v0.0.1",
//                 license = @License(
//                         name = "Apache License Version 2.0",
//                         url = "https://www.apache.org/licenses/LICENSE-2.0"
//                 )
//         )
// )
// public class OpenAPIConfig {
// }

// https://github.com/thawat-th/direct-print-service/blob/master/src/main/java/com/github/gdl/DirectPrintController.java

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}