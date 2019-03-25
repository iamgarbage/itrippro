package cn.itrip.beans.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.sql.Date;

/**
 * 酒店表
 */
public class ItripHotel implements Serializable {
    private static final long serialVersionUID = -4899350744246053970L;
    @Field("id")
    private String id;
    @Field("hotelName")
    private String hotelName;                   //酒店名称
    private Integer countryId;                  //所在国家id
    private Integer provinceId;                 //所在省份id
    private Integer cityId;                      //所在城市id
    @Field("address")
    private String address;                      //酒店所在地址
    private String details;                     //酒店介绍（保存附文本）
    private String facilities;                  //酒店设施
    private String hotelPolicy;                 //酒店政策
    private int hotelType;                      //酒店类型(1:国内酒店 2:国际酒店)
    private int hotelLevel;                     //(1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
    private int isGroupPurchase;                //是否是团购酒店
    private String redundantCityName;           //城市名称 冗余字段
    private String redundantProvinceName;       //省名称 冗余字段
    private String redundantCountryName;        //国家名称 冗余字段
    private int redundantHotelStore;            //酒店库存（冗余，每天开定时任务的时候更新）
    private Date creationDate;
    private Integer createdBy;
    private Date modifyDate;
    private Integer modifiedBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getHotelType() {
        return hotelType;
    }

    public void setHotelType(int hotelType) {
        this.hotelType = hotelType;
    }

    public int getHotelLevel() {
        return hotelLevel;
    }

    public void setHotelLevel(int hotelLevel) {
        this.hotelLevel = hotelLevel;
    }

    public int getIsGroupPurchase() {
        return isGroupPurchase;
    }

    public void setIsGroupPurchase(int isGroupPurchase) {
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

    public int getRedundantHotelStore() {
        return redundantHotelStore;
    }

    public void setRedundantHotelStore(int redundantHotelStore) {
        this.redundantHotelStore = redundantHotelStore;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
