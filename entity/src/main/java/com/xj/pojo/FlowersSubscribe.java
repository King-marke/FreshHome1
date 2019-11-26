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
    public class FlowersSubscribe implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 鲜花订阅id
            */
            @TableId(value = "f_s_id", type = IdType.AUTO)
    private Integer fSId;

            /**
            * 低于价格
            */
    private Float fLowPrice;

            /**
            * 鲜花id
            */
    private Integer fFreshId;

            /**
            * 电子邮箱
            */
    private String fSEmail;

        public Integer getfSId() {
        return fSId;
        }

            public void setfSId(Integer fSId) {
        this.fSId = fSId;
        }
        public Float getfLowPrice() {
        return fLowPrice;
        }

            public void setfLowPrice(Float fLowPrice) {
        this.fLowPrice = fLowPrice;
        }
        public Integer getfFreshId() {
        return fFreshId;
        }

            public void setfFreshId(Integer fFreshId) {
        this.fFreshId = fFreshId;
        }
        public String getfSEmail() {
        return fSEmail;
        }

            public void setfSEmail(String fSEmail) {
        this.fSEmail = fSEmail;
        }

    @Override
    public String toString() {
    return "FlowersSubscribe{" +
            "fSId=" + fSId +
            ", fLowPrice=" + fLowPrice +
            ", fFreshId=" + fFreshId +
            ", fSEmail=" + fSEmail +
    "}";
    }
}
