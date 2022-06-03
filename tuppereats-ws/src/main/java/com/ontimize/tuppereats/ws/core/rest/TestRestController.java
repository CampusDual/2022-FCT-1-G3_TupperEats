package com.ontimize.tuppereats.ws.core.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestRestController {

	@GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> testRest() {
		return new ResponseEntity<>("It Works!", HttpStatus.OK);
	}

}
