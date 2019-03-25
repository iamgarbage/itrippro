package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * 产品商店
 */
public class ItripProductStore implements Serializable {
    private static final long serialVersionUID = 3298438847131582549L;
    private Integer id;
    private Integer productType;    //商品类型(0:旅游产品 1:酒店产品 2:机票产品)
    private int productId;          //商品id
    private int store;               //商品库存
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

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
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
