package cn.itrip.beans;


import java.sql.Timestamp;

public class ItripComment {

    private Integer id;
    private Integer hotelId;
    private Integer productId;
    private Integer orderId;
    private Integer productType;
    private String content;
    private Integer userId;
    private Integer isHavingImg;
    private Integer positionScore;
    private Integer facilitiesScore;
    private Integer serviceScore;
    private Integer hygieneScore;
    private Integer score;
    private Integer tripMode;
    private Integer isOk;
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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsHavingImg() {
        return isHavingImg;
    }

    public void setIsHavingImg(Integer isHavingImg) {
        this.isHavingImg = isHavingImg;
    }

    public Integer getPositionScore() {
        return positionScore;
    }

    public void setPositionScore(Integer positionScore) {
        this.positionScore = positionScore;
    }

    public Integer getFacilitiesScore() {
        return facilitiesScore;
    }

    public void setFacilitiesScore(Integer facilitiesScore) {
        this.facilitiesScore = facilitiesScore;
    }

    public Integer getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
    }

    public Integer getHygieneScore() {
        return hygieneScore;
    }

    public void setHygieneScore(Integer hygieneScore) {
        this.hygieneScore = hygieneScore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTripMode() {
        return tripMode;
    }

    public void setTripMode(Integer tripMode) {
        this.tripMode = tripMode;
    }

    public Integer getIsOk() {
        return isOk;
    }

    public void setIsOk(Integer isOk) {
        this.isOk = isOk;
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
