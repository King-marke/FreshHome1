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
    public class FlowersShippingAddress implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 地址id
            */
            @TableId(value = "a_id", type = IdType.AUTO)
    private Integer aId;

            /**
            * 用户id
            */
    private Integer uId;

            /**
            * 收货人姓名
            */
    private String aName;

            /**
            * 收货人手机
            */
    private String aPhone;

            /**
            * 配送地区
            */
    private String aRegion;

            /**
            * 配送地址
            */
    private String aAddress;

            /**
            * 是否为默认地址
            */
    private Integer aDefaultAddress;

        public Integer getaId() {
        return aId;
        }

            public void setaId(Integer aId) {
        this.aId = aId;
        }
        public Integer getuId() {
        return uId;
        }

            public void setuId(Integer uId) {
        this.uId = uId;
        }
        public String getaName() {
        return aName;
        }

            public void setaName(String aName) {
        this.aName = aName;
        }
        public String getaPhone() {
        return aPhone;
        }

            public void setaPhone(String aPhone) {
        this.aPhone = aPhone;
        }
        public String getaRegion() {
        return aRegion;
        }

            public void setaRegion(String aRegion) {
        this.aRegion = aRegion;
        }
        public String getaAddress() {
        return aAddress;
        }

            public void setaAddress(String aAddress) {
        this.aAddress = aAddress;
        }
        public Integer getaDefaultAddress() {
        return aDefaultAddress;
        }

            public void setaDefaultAddress(Integer aDefaultAddress) {
        this.aDefaultAddress = aDefaultAddress;
        }

    @Override
    public String toString() {
    return "FlowersShippingAddress{" +
            "aId=" + aId +
            ", uId=" + uId +
            ", aName=" + aName +
            ", aPhone=" + aPhone +
            ", aRegion=" + aRegion +
            ", aAddress=" + aAddress +
            ", aDefaultAddress=" + aDefaultAddress +
    "}";
    }
}
