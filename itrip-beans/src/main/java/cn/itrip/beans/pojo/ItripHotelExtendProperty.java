package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * 酒店延伸属性表
 */
public class ItripHotelExtendProperty implements Serializable {
    private static final long serialVersionUID = -5518123864032012011L;
    private Integer id;
    private Integer hotelId;                //酒店id
    private Integer extendPropertyId;       //推广属性
    private Date creationDate;
    private Integer createdBy;
    private Date modifyDate;
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
