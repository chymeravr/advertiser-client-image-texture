package co.chimeralabs.advertiser.client.apiDTO;

public class ImageTextureAdDTO {
	private String advertiserId;
	private String adId;
	private String adResourceIdentifier;
	private String adResourceFormat;
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

	public String getAdResourceIdentifier() {
		return adResourceIdentifier;
	}

	public void setAdResourceIdentifier(String adResourceIdentifier) {
		this.adResourceIdentifier = adResourceIdentifier;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getAdResourceFormat() {
		return adResourceFormat;
	}

	public void setAdResourceFormat(String adResourceFormat) {
		this.adResourceFormat = adResourceFormat;
	}
	
}
