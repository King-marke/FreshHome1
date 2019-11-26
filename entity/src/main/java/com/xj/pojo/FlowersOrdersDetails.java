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
    public class FlowersOrdersDetails implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 明细id
            */
            @TableId(value = "f_details_id", type = IdType.AUTO)
    private Integer fDetailsId;

            /**
            * 订单编号
            */
    private Integer fOrderId;

            /**
            * 商品id
            */
    private Integer fGoodsId;

            /**
            * 商品小计
            */
    private Float fMoney;

            /**
            * 备用字段
            */
    private String fStandby;

        public Integer getfDetailsId() {
        return fDetailsId;
        }

            public void setfDetailsId(Integer fDetailsId) {
        this.fDetailsId = fDetailsId;
        }
        public Integer getfOrderId() {
        return fOrderId;
        }

            public void setfOrderId(Integer fOrderId) {
        this.fOrderId = fOrderId;
        }
        public Integer getfGoodsId() {
        return fGoodsId;
        }

            public void setfGoodsId(Integer fGoodsId) {
        this.fGoodsId = fGoodsId;
        }
        public Float getfMoney() {
        return fMoney;
        }

            public void setfMoney(Float fMoney) {
        this.fMoney = fMoney;
        }
        public String getfStandby() {
        return fStandby;
        }

            public void setfStandby(String fStandby) {
        this.fStandby = fStandby;
        }

    @Override
    public String toString() {
    return "FlowersOrdersDetails{" +
            "fDetailsId=" + fDetailsId +
            ", fOrderId=" + fOrderId +
            ", fGoodsId=" + fGoodsId +
            ", fMoney=" + fMoney +
            ", fStandby=" + fStandby +
    "}";
    }
}
