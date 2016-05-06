package co.chimeralabs.advertiser.client.apiDTO;

public class ImageTextureAdDTO {
	private String advertiserId;
	private String adId;
	private String adResourceUrl;
	private String errorMsg;
	
	public ImageTextureAdDTO(){

	}

	public String getAdvertiserId() {
		return advertiserId;
	}

	public void setAdvertiserId(String advertiserId) {
		this.advertiserId = advertiserId;
	}

	public String getAdId() {
		return adId;
	}

	public void setAdId(String adId) {
		this.adId = adId;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getAdResourceUrl() {
		return adResourceUrl;
	}

	public void setAdResourceUrl(String adResourceUrl) {
		this.adResourceUrl = adResourceUrl;
	}
	
}
