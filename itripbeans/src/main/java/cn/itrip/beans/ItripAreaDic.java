package cn.itrip.beans;


import java.sql.Timestamp;

public class ItripAreaDic {

  private Integer id;
  private String name;
  private String areaNo;
  private Integer parent;
  private Integer isActivated;
  private Integer isTradingArea;
  private Integer isHot;
  private Integer level;
  private Integer isChina;
  private String pinyin;
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAreaNo() {
    return areaNo;
  }

  public void setAreaNo(String areaNo) {
    this.areaNo = areaNo;
  }

  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public Integer getIsActivated() {
    return isActivated;
  }

  public void setIsActivated(Integer isActivated) {
    this.isActivated = isActivated;
  }

  public Integer getIsTradingArea() {
    return isTradingArea;
  }

  public void setIsTradingArea(Integer isTradingArea) {
    this.isTradingArea = isTradingArea;
  }

  public Integer getIsHot() {
    return isHot;
  }

  public void setIsHot(Integer isHot) {
    this.isHot = isHot;
  }

  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public Integer getIsChina() {
    return isChina;
  }

  public void setIsChina(Integer isChina) {
    this.isChina = isChina;
  }

  public String getPinyin() {
    return pinyin;
  }

  public void setPinyin(String pinyin) {
    this.pinyin = pinyin;
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
