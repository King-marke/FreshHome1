package com.xj.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author XQK
 * @since 2019-11-23
 */
public class FlowersFresh implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 鲜花ID
     */
    @TableId(value = "f_fresh_id", type = IdType.AUTO)
    private Integer fFreshId;

    /**
     * 鲜花名称
     */
    private String fName;

    /**
     * 标明是鲜花还是永生花,礼品
     */
    private Integer flyId;

    /**
     * 鲜花用途id
     */
    private Integer flyUseId;

    /**
     * 鲜花适用对象
     */
    private Integer floFlyRoleId;

    /**
     * 鲜花价格
     */
    private Float flyPrice;

    /**
     * 鲜花花材id
     */
    private Integer flyMaterialId;

    /**
     * 鲜花类别id
     */
    private Integer flyTypeId;

    /**
     * 鲜花枝数
     */
    private Integer fNum;

    /**
     * 鲜花上架日期
     */
    private LocalDateTime fShelvesData;

    /**
     * 鲜花折扣
     */
    private Double fDiscount;

    /**
     * 鲜花销量
     */
    private Integer fSales;

    /**
     * 鲜花收藏人气
     */
    private Integer fSentiment;

    /**
     * 鲜花评价数量
     */
    private Integer fEvaluationNum;

    /**
     * 鲜花主花材
     */
    private String fMainMaterial;

    /**
     * 花束辅料
     */
    private String fSupplementary;

    /**
     * 花束包装
     */
    private String fPackaging;

    /**
     * 鲜花标签1
     */
    private Integer fLabel1Id;

    /**
     * 鲜花标签2
     */
    private Integer fLabel2Id;

    /**
     * 鲜花标签3
     */
    private Integer fLabel3Id;

    /**
     * 库存
     */
    private Integer fInventory;

    /**
     * 绿植工艺
     */
    private String fPlantProcess;

    /**
     * 商品类别
     */
    private String fLb;

    /**
     * 适用场景
     */
    private String fSycj;

    /**
     * 适用对象
     */
    private String fSydx;

    public Integer getfFreshId() {
        return fFreshId;
    }

    public void setfFreshId(Integer fFreshId) {
        this.fFreshId = fFreshId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public Integer getFlyId() {
        return flyId;
    }

    public void setFlyId(Integer flyId) {
        this.flyId = flyId;
    }

    public Integer getFlyUseId() {
        return flyUseId;
    }

    public void setFlyUseId(Integer flyUseId) {
        this.flyUseId = flyUseId;
    }

    public Integer getFloFlyRoleId() {
        return floFlyRoleId;
    }

    public void setFloFlyRoleId(Integer floFlyRoleId) {
        this.floFlyRoleId = floFlyRoleId;
    }

    public Float getFlyPrice() {
        return flyPrice;
    }

    public void setFlyPrice(Float flyPrice) {
        this.flyPrice = flyPrice;
    }

    public Integer getFlyMaterialId() {
        return flyMaterialId;
    }

    public void setFlyMaterialId(Integer flyMaterialId) {
        this.flyMaterialId = flyMaterialId;
    }

    public Integer getFlyTypeId() {
        return flyTypeId;
    }

    public void setFlyTypeId(Integer flyTypeId) {
        this.flyTypeId = flyTypeId;
    }

    public Integer getfNum() {
        return fNum;
    }

    public void setfNum(Integer fNum) {
        this.fNum = fNum;
    }

    public LocalDateTime getfShelvesData() {
        return fShelvesData;
    }

    public void setfShelvesData(LocalDateTime fShelvesData) {
        this.fShelvesData = fShelvesData;
    }

    public Double getfDiscount() {
        return fDiscount;
    }

    public void setfDiscount(Double fDiscount) {
        this.fDiscount = fDiscount;
    }

    public Integer getfSales() {
        return fSales;
    }

    public void setfSales(Integer fSales) {
        this.fSales = fSales;
    }

    public Integer getfSentiment() {
        return fSentiment;
    }

    public void setfSentiment(Integer fSentiment) {
        this.fSentiment = fSentiment;
    }

    public Integer getfEvaluationNum() {
        return fEvaluationNum;
    }

    public void setfEvaluationNum(Integer fEvaluationNum) {
        this.fEvaluationNum = fEvaluationNum;
    }

    public String getfMainMaterial() {
        return fMainMaterial;
    }

    public void setfMainMaterial(String fMainMaterial) {
        this.fMainMaterial = fMainMaterial;
    }

    public String getfSupplementary() {
        return fSupplementary;
    }

    public void setfSupplementary(String fSupplementary) {
        this.fSupplementary = fSupplementary;
    }

    public String getfPackaging() {
        return fPackaging;
    }

    public void setfPackaging(String fPackaging) {
        this.fPackaging = fPackaging;
    }

    public Integer getfLabel1Id() {
        return fLabel1Id;
    }

    public void setfLabel1Id(Integer fLabel1Id) {
        this.fLabel1Id = fLabel1Id;
    }

    public Integer getfLabel2Id() {
        return fLabel2Id;
    }

    public void setfLabel2Id(Integer fLabel2Id) {
        this.fLabel2Id = fLabel2Id;
    }

    public Integer getfLabel3Id() {
        return fLabel3Id;
    }

    public void setfLabel3Id(Integer fLabel3Id) {
        this.fLabel3Id = fLabel3Id;
    }

    public Integer getfInventory() {
        return fInventory;
    }

    public void setfInventory(Integer fInventory) {
        this.fInventory = fInventory;
    }

    public String getfPlantProcess() {
        return fPlantProcess;
    }

    public void setfPlantProcess(String fPlantProcess) {
        this.fPlantProcess = fPlantProcess;
    }

    public String getfLb() {
        return fLb;
    }

    public void setfLb(String fLb) {
        this.fLb = fLb;
    }

    public String getfSycj() {
        return fSycj;
    }

    public void setfSycj(String fSycj) {
        this.fSycj = fSycj;
    }

    public String getfSydx() {
        return fSydx;
    }

    public void setfSydx(String fSydx) {
        this.fSydx = fSydx;
    }

    @Override
    public String toString() {
        return "FlowersFresh{" +
                "fFreshId=" + fFreshId +
                ", fName=" + fName +
                ", flyId=" + flyId +
                ", flyUseId=" + flyUseId +
                ", floFlyRoleId=" + floFlyRoleId +
                ", flyPrice=" + flyPrice +
                ", flyMaterialId=" + flyMaterialId +
                ", flyTypeId=" + flyTypeId +
                ", fNum=" + fNum +
                ", fShelvesData=" + fShelvesData +
                ", fDiscount=" + fDiscount +
                ", fSales=" + fSales +
                ", fSentiment=" + fSentiment +
                ", fEvaluationNum=" + fEvaluationNum +
                ", fMainMaterial=" + fMainMaterial +
                ", fSupplementary=" + fSupplementary +
                ", fPackaging=" + fPackaging +
                ", fLabel1Id=" + fLabel1Id +
                ", fLabel2Id=" + fLabel2Id +
                ", fLabel3Id=" + fLabel3Id +
                ", fInventory=" + fInventory +
                ", fPlantProcess=" + fPlantProcess +
                ", fLb=" + fLb +
                ", fSycj=" + fSycj +
                ", fSydx=" + fSydx +
                "}";
    }
}
