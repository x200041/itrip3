package cn.itrip.beans;

import java.sql.Timestamp;

public class ItripHotelExtendProperty {

  private Integer id;
  private Integer hotelId;
  private Integer extendPropertyId;
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

  public Integer getHotelId() {
    return hotelId;
  }

  public void setHotelId(Integer hotelId) {
    this.hotelId = hotelId;
  }

  public Integer getExtendPropertyId() {
    return extendPropertyId;
  }

  public void setExtendPropertyId(Integer extendPropertyId) {
    this.extendPropertyId = extendPropertyId;
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
