package com.xj.pojo;

    import com.baomidou.mybatisplus.annotation.IdType;
    import java.time.LocalDate;
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
    public class FlowersCoupons implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 优惠券ID
            */
            @TableId(value = "c_id", type = IdType.AUTO)
    private Integer cId;

            /**
            * 活动内容
            */
    private String cContent;

            /**
            * 满减金额
            */
    private Float cReduction;

            /**
            * 优惠金额
            */
    private Float cPreferential;

            /**
            * 生效日期
            */
    private LocalDateTime cEffectiveDate;

            /**
            * 失效日期
            */
    private LocalDate cExpiryDate;

        public Integer getcId() {
        return cId;
        }

            public void setcId(Integer cId) {
        this.cId = cId;
        }
        public String getcContent() {
        return cContent;
        }

            public void setcContent(String cContent) {
        this.cContent = cContent;
        }
        public Float getcReduction() {
        return cReduction;
        }

            public void setcReduction(Float cReduction) {
        this.cReduction = cReduction;
        }
        public Float getcPreferential() {
        return cPreferential;
        }

            public void setcPreferential(Float cPreferential) {
        this.cPreferential = cPreferential;
        }
        public LocalDateTime getcEffectiveDate() {
        return cEffectiveDate;
        }

            public void setcEffectiveDate(LocalDateTime cEffectiveDate) {
        this.cEffectiveDate = cEffectiveDate;
        }
        public LocalDate getcExpiryDate() {
        return cExpiryDate;
        }

            public void setcExpiryDate(LocalDate cExpiryDate) {
        this.cExpiryDate = cExpiryDate;
        }

    @Override
    public String toString() {
    return "FlowersCoupons{" +
            "cId=" + cId +
            ", cContent=" + cContent +
            ", cReduction=" + cReduction +
            ", cPreferential=" + cPreferential +
            ", cEffectiveDate=" + cEffectiveDate +
            ", cExpiryDate=" + cExpiryDate +
    "}";
    }
}
