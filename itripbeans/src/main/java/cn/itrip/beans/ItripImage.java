package cn.itrip.beans;


import java.sql.Timestamp;

public class ItripImage {

  private Integer id;
  private String type;
  private Integer targetId;
  private Integer position;
  private String imgUrl;
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


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Integer getTargetId() {
    return targetId;
  }

  public void setTargetId(Integer targetId) {
    this.targetId = targetId;
  }


  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }


  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
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
