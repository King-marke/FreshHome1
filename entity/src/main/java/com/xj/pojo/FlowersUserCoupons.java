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
    public class FlowersUserCoupons implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 用户优惠券ID
            */
            @TableId(value = "u_c_id", type = IdType.AUTO)
    private Integer uCId;

            /**
            * 用户id
            */
    private Integer uId;

            /**
            * 优惠券id
            */
    private Integer cId;

            /**
            * 优惠券标记
            */
    private Integer cTag;

            /**
            * 花材id
            */
    private Integer flyMaterialId;

        public Integer getuCId() {
        return uCId;
        }

            public void setuCId(Integer uCId) {
        this.uCId = uCId;
        }
        public Integer getuId() {
        return uId;
        }

            public void setuId(Integer uId) {
        this.uId = uId;
        }
        public Integer getcId() {
        return cId;
        }

            public void setcId(Integer cId) {
        this.cId = cId;
        }
        public Integer getcTag() {
        return cTag;
        }

            public void setcTag(Integer cTag) {
        this.cTag = cTag;
        }
        public Integer getFlyMaterialId() {
        return flyMaterialId;
        }

            public void setFlyMaterialId(Integer flyMaterialId) {
        this.flyMaterialId = flyMaterialId;
        }

    @Override
    public String toString() {
    return "FlowersUserCoupons{" +
            "uCId=" + uCId +
            ", uId=" + uId +
            ", cId=" + cId +
            ", cTag=" + cTag +
            ", flyMaterialId=" + flyMaterialId +
    "}";
    }
}
