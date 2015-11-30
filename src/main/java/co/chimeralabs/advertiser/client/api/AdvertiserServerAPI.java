package co.chimeralabs.advertiser.client.api;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import co.chimeralabs.advertiser.client.apiDTO.AdResourceData;
import co.chimeralabs.advertiser.client.apiDTO.ImageTextureAdDTO;
import co.chimeralabs.advertiser.client.apiDTO.ImageTextureAdsDTO;

public class AdvertiserServerAPI {
	private String url = "http://localhost:8080/advertiser/api/ads";
	public AdvertiserServerAPI(){
	}
	
	public ImageTextureAdsDTO getAdResourceData(){
		RestTemplate restTemplat = new RestTemplate();
		ImageTextureAdsDTO imageTextureAdsDTO;
		try{
			imageTextureAdsDTO = restTemplat.getForObject(url, ImageTextureAdsDTO.class);
		}
		catch(RestClientException e){
			imageTextureAdsDTO = new ImageTextureAdsDTO();
			imageTextureAdsDTO.setErrorMsg(e.getMessage());
		}
		//adResourceData = new AdResourceData(response, response, response);
		return imageTextureAdsDTO;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
