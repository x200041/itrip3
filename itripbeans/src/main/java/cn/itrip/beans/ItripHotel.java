package cn.itrip.beans;


import java.sql.Timestamp;

public class ItripHotel {
  private Integer id;
  private String hotelName;
  private Integer countryId;
  private Integer provinceId;
  private Integer cityId;
  private String address;
  private String details;
  private String facilities;
  private String hotelPolicy;
  private Integer hotelType;
  private Integer hotelLevel;
  private Integer isGroupPurchase;
  private String redundantCityName;
  private String redundantProvinceName;
  private String redundantCountryName;
  private Integer redundantHotelStore;
  private Timestamp creationDate;
  private Integer createdBy;
  private Timestamp modifyDate;
  private Integer modifiedBy;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public Integer getCountryId() {
    return countryId;
  }

  public void setCountryId(Integer countryId) {
    this.countryId = countryId;
  }

  public Integer getProvinceId() {
    return provinceId;
  }

  public void setProvinceId(Integer provinceId) {
    this.provinceId = provinceId;
  }

  public Integer getCityId() {
    return cityId;
  }

  public void setCityId(Integer cityId) {
    this.cityId = cityId;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public String getFacilities() {
    return facilities;
  }

  public void setFacilities(String facilities) {
    this.facilities = facilities;
  }

  public String getHotelPolicy() {
    return hotelPolicy;
  }

  public void setHotelPolicy(String hotelPolicy) {
    this.hotelPolicy = hotelPolicy;
  }

  public Integer getHotelType() {
    return hotelType;
  }

  public void setHotelType(Integer hotelType) {
    this.hotelType = hotelType;
  }

  public Integer getHotelLevel() {
    return hotelLevel;
  }

  public void setHotelLevel(Integer hotelLevel) {
    this.hotelLevel = hotelLevel;
  }

  public Integer getIsGroupPurchase() {
    return isGroupPurchase;
  }

  public void setIsGroupPurchase(Integer isGroupPurchase) {
    this.isGroupPurchase = isGroupPurchase;
  }

  public String getRedundantCityName() {
    return redundantCityName;
  }

  public void setRedundantCityName(String redundantCityName) {
    this.redundantCityName = redundantCityName;
  }

  public String getRedundantProvinceName() {
    return redundantProvinceName;
  }

  public void setRedundantProvinceName(String redundantProvinceName) {
    this.redundantProvinceName = redundantProvinceName;
  }

  public String getRedundantCountryName() {
    return redundantCountryName;
  }

  public void setRedundantCountryName(String redundantCountryName) {
    this.redundantCountryName = redundantCountryName;
  }

  public Integer getRedundantHotelStore() {
    return redundantHotelStore;
  }

  public void setRedundantHotelStore(Integer redundantHotelStore) {
    this.redundantHotelStore = redundantHotelStore;
  }

  public Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Timestamp creationDate) {
    this.creationDate = creationDate;
  }

  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  public Timestamp getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }

  public Integer getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(Integer modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
}
