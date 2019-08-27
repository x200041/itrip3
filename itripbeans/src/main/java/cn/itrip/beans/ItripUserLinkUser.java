package cn.itrip.beans;


import java.sql.Timestamp;

public class ItripUserLinkUser {

  private Integer id;
  private String linkUserName;
  private String linkIdCard;
  private String linkPhone;
  private Integer userId;
  private Timestamp creationDate;
  private Integer createdBy;
  private Timestamp modifyDate;
  private Integer modifiedBy;
  private Integer linkIdCardType;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getLinkUserName() {
    return linkUserName;
  }

  public void setLinkUserName(String linkUserName) {
    this.linkUserName = linkUserName;
  }


  public String getLinkIdCard() {
    return linkIdCard;
  }

  public void setLinkIdCard(String linkIdCard) {
    this.linkIdCard = linkIdCard;
  }


  public String getLinkPhone() {
    return linkPhone;
  }

  public void setLinkPhone(String linkPhone) {
    this.linkPhone = linkPhone;
  }


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
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


  public Integer getLinkIdCardType() {
    return linkIdCardType;
  }

  public void setLinkIdCardType(Integer linkIdCardType) {
    this.linkIdCardType = linkIdCardType;
  }

}
