package com.sparta.kd.webclientapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result{

	@JsonProperty("country")
	private String country;

	@JsonProperty("codes")
	private Codes codes;

	@JsonProperty("ced")
	private Object ced;

	@JsonProperty("parliamentary_constituency_2024")
	private String parliamentaryConstituency2024;

	@JsonProperty("ccg")
	private String ccg;

	@JsonProperty("latitude")
	private Double latitude;

	@JsonProperty("admin_county")
	private Object adminCounty;

	@JsonProperty("msoa")
	private String msoa;

	@JsonProperty("primary_care_trust")
	private String primaryCareTrust;

	@JsonProperty("parish")
	private String parish;

	@JsonProperty("nhs_ha")
	private String nhsHa;

	@JsonProperty("date_of_introduction")
	private String dateOfIntroduction;

	@JsonProperty("longitude")
	private Double longitude;

	@JsonProperty("postcode")
	private String postcode;

	@JsonProperty("european_electoral_region")
	private String europeanElectoralRegion;

	@JsonProperty("parliamentary_constituency")
	private String parliamentaryConstituency;

	@JsonProperty("admin_ward")
	private String adminWard;

	@JsonProperty("eastings")
	private Integer eastings;

	@JsonProperty("pfa")
	private String pfa;

	@JsonProperty("lsoa")
	private String lsoa;

	@JsonProperty("admin_district")
	private String adminDistrict;

	@JsonProperty("quality")
	private Integer quality;

	@JsonProperty("nuts")
	private String nuts;

	@JsonProperty("outcode")
	private String outcode;

	@JsonProperty("northings")
	private Integer northings;

	@JsonProperty("incode")
	private String incode;

	@JsonProperty("region")
	private String region;

	public String getCountry(){
		return country;
	}

	public Codes getCodes(){
		return codes;
	}

	public Object getCed(){
		return ced;
	}

	public String getParliamentaryConstituency2024(){
		return parliamentaryConstituency2024;
	}

	public String getCcg(){
		return ccg;
	}

	public Double getLatitude(){
		return latitude;
	}

	public Object getAdminCounty(){
		return adminCounty;
	}

	public String getMsoa(){
		return msoa;
	}

	public String getPrimaryCareTrust(){
		return primaryCareTrust;
	}

	public String getParish(){
		return parish;
	}

	public String getNhsHa(){
		return nhsHa;
	}

	public String getDateOfIntroduction(){
		return dateOfIntroduction;
	}

	public Double getLongitude(){
		return longitude;
	}

	public String getPostcode(){
		return postcode;
	}

	public String getEuropeanElectoralRegion(){
		return europeanElectoralRegion;
	}

	public String getParliamentaryConstituency(){
		return parliamentaryConstituency;
	}

	public String getAdminWard(){
		return adminWard;
	}

	public Integer getEastings(){
		return eastings;
	}

	public String getPfa(){
		return pfa;
	}

	public String getLsoa(){
		return lsoa;
	}

	public String getAdminDistrict(){
		return adminDistrict;
	}

	public Integer getQuality(){
		return quality;
	}

	public String getNuts(){
		return nuts;
	}

	public String getOutcode(){
		return outcode;
	}

	public Integer getNorthings(){
		return northings;
	}

	public String getIncode(){
		return incode;
	}

	public String getRegion(){
		return region;
	}
}