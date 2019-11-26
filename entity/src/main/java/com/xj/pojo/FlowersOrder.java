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
    public class FlowersOrder implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 订单ID
            */
            @TableId(value = "o_id", type = IdType.AUTO)
    private Integer oId;

            /**
            * 订单号
            */
    private String oNumber;

            /**
            * 订单创建时间
            */
    private LocalDateTime oDate;

            /**
            * 用户id
            */
    private Integer uId;

            /**
            * 留言信息id
            */
    private Integer omiId;

            /**
            * 收货时间
            */
    private LocalDate oGoodsTime;

            /**
            * 总金额
            */
    private Float oMoney;

            /**
            * 订单状态
            */
    private Integer oState;

            /**
            * 备用字段
            */
    private String oStandby;

        public Integer getoId() {
        return oId;
        }

            public void setoId(Integer oId) {
        this.oId = oId;
        }
        public String getoNumber() {
        return oNumber;
        }

            public void setoNumber(String oNumber) {
        this.oNumber = oNumber;
        }
        public LocalDateTime getoDate() {
        return oDate;
        }

            public void setoDate(LocalDateTime oDate) {
        this.oDate = oDate;
        }
        public Integer getuId() {
        return uId;
        }

            public void setuId(Integer uId) {
        this.uId = uId;
        }
        public Integer getOmiId() {
        return omiId;
        }

            public void setOmiId(Integer omiId) {
        this.omiId = omiId;
        }
        public LocalDate getoGoodsTime() {
        return oGoodsTime;
        }

            public void setoGoodsTime(LocalDate oGoodsTime) {
        this.oGoodsTime = oGoodsTime;
        }
        public Float getoMoney() {
        return oMoney;
        }

            public void setoMoney(Float oMoney) {
        this.oMoney = oMoney;
        }
        public Integer getoState() {
        return oState;
        }

            public void setoState(Integer oState) {
        this.oState = oState;
        }
        public String getoStandby() {
        return oStandby;
        }

            public void setoStandby(String oStandby) {
        this.oStandby = oStandby;
        }

    @Override
    public String toString() {
    return "FlowersOrder{" +
            "oId=" + oId +
            ", oNumber=" + oNumber +
            ", oDate=" + oDate +
            ", uId=" + uId +
            ", omiId=" + omiId +
            ", oGoodsTime=" + oGoodsTime +
            ", oMoney=" + oMoney +
            ", oState=" + oState +
            ", oStandby=" + oStandby +
    "}";
    }
}
