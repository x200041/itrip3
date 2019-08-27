package cn.itrip.beans;


import java.sql.Timestamp;

public class ItripHotelTempStore {

  private long id;
  private long hotelId;
  private long roomId;
  private Timestamp recordDate;
  private long store;
  private Timestamp creationDate;
  private long createdBy;
  private Timestamp modifyDate;
  private long modifiedBy;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getHotelId() {
    return hotelId;
  }

  public void setHotelId(long hotelId) {
    this.hotelId = hotelId;
  }


  public long getRoomId() {
    return roomId;
  }

  public void setRoomId(long roomId) {
    this.roomId = roomId;
  }


  public Timestamp getRecordDate() {
    return recordDate;
  }

  public void setRecordDate(Timestamp recordDate) {
    this.recordDate = recordDate;
  }


  public long getStore() {
    return store;
  }

  public void setStore(long store) {
    this.store = store;
  }


  public Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Timestamp creationDate) {
    this.creationDate = creationDate;
  }


  public long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(long createdBy) {
    this.createdBy = createdBy;
  }


  public Timestamp getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }


  public long getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(long modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

}
