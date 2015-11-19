package co.chimeralabs.advertiser.client.api;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import co.chimeralabs.advertiser.client.apiDTO.AdResourceData;

public class AdvertiserServerAPI {
	public AdvertiserServerAPI(){
	}
	
	public AdResourceData getAdResourceData(){
		RestTemplate restTemplat = new RestTemplate();
		String url = "http://localhost:8080/advertiserserver/publisher/api/loadad";
		AdResourceData adResourceData;
		String response = new String();
		try{
			response = restTemplat.getForObject(url, String.class);
			adResourceData = restTemplat.getForObject(url, AdResourceData.class);
		}
		catch(RestClientException e){
			adResourceData = new AdResourceData(e.getMessage(), e.getLocalizedMessage(), "");
		}
		//adResourceData = new AdResourceData(response, response, response);
		return adResourceData;
	}
}
