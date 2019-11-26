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
    public class FlowersOrderMessageType implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 订单留言类型id
            */
            @TableId(value = "omt_id", type = IdType.AUTO)
    private Integer omtId;

            /**
            * 留言类型
            */
    private String omtInformation;

        public Integer getOmtId() {
        return omtId;
        }

            public void setOmtId(Integer omtId) {
        this.omtId = omtId;
        }
        public String getOmtInformation() {
        return omtInformation;
        }

            public void setOmtInformation(String omtInformation) {
        this.omtInformation = omtInformation;
        }

    @Override
    public String toString() {
    return "FlowersOrderMessageType{" +
            "omtId=" + omtId +
            ", omtInformation=" + omtInformation +
    "}";
    }
}
