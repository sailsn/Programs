package com.spring.restexample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Response;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GooglePlaces {

	/*
	 * private String API_KEY = "AIzaSyCcpuQwO92n9pd3N_n_4j4keIn2ZAiMUZ8"; private
	 * String input = "hyderabad"; private String googlePlacesAPIURL =
	 * "https://maps.googleapis.com/maps/api/place/autocomplete/json";
	 */

	private static String googleAPIURL = "https://maps.googleapis.com/maps/api/place/autocomplete/json?input=hyderabad&key=AIzaSyCcpuQwO92n9pd3N_n_4j4keIn2ZAiMUZ8";

	// private static String googleAPI =
	// "https://maps.googleapis.com/maps/api/place/autocomplete/json?input=";

	public static void main(String[] args) {

		{

			try {
				ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
						false);
				HttpHeaders header = new HttpHeaders();
				header.add("Accept", "application/json");

				HttpEntity<String> entity = new HttpEntity<String>(header);

				RestTemplate restTemplate = new RestTemplate();
				JsonNode response = restTemplate.exchange(googleAPIURL, HttpMethod.GET, entity, JsonNode.class)
						.getBody();
				System.out.println(response);
				List<Google> places = new ArrayList<Google>();
				if (response != null && response.has("predictions")) {
					JsonNode queryNode = response.path("predictions");
					if (queryNode != null && queryNode.size() > 0) {
						for (JsonNode json : queryNode) {
							Google google = new Google();

							if (json.has("description")) {
								google.setDescription(json.get("description").asText());

							}
							places.add(google);
						}
					}
				}

			} catch (Exception e) {
				e.printStackTrace();

				/*
				 * Google google = mapper.readValue(response, Google.class);
				 * 
				 * System.out.println(google);
				 */
			}
		}

	}
}