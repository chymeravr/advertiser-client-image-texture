package co.chimeralabs.advertiser.client.apiDTO;

public class ImageTextureAdDTO {
	private String adResourceIdentifier;
	private String adResourceFormat;
	private String errorMsg;
	
	public ImageTextureAdDTO(){

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
