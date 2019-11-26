package com.xj.pojo;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author XQK
* @since 2019-11-23
*/
    public class FlowersFatherthreePrice implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 价格表
            */
            @TableId(value = "fly_price_id", type = IdType.AUTO)
    private Integer flyPriceId;

            /**
            * 一级分类id
            */
    private Integer flyId;

            /**
            * 二级分类id
            */
    private Integer flyTwoId;

            /**
            * 价格介绍
            */
    private String flyPrice;

        public Integer getFlyPriceId() {
        return flyPriceId;
        }

            public void setFlyPriceId(Integer flyPriceId) {
        this.flyPriceId = flyPriceId;
        }
        public Integer getFlyId() {
        return flyId;
        }

            public void setFlyId(Integer flyId) {
        this.flyId = flyId;
        }
        public Integer getFlyTwoId() {
        return flyTwoId;
        }

            public void setFlyTwoId(Integer flyTwoId) {
        this.flyTwoId = flyTwoId;
        }
        public String getFlyPrice() {
        return flyPrice;
        }

            public void setFlyPrice(String flyPrice) {
        this.flyPrice = flyPrice;
        }

    @Override
    public String toString() {
    return "FlowersFatherthreePrice{" +
            "flyPriceId=" + flyPriceId +
            ", flyId=" + flyId +
            ", flyTwoId=" + flyTwoId +
            ", flyPrice=" + flyPrice +
    "}";
    }
}
