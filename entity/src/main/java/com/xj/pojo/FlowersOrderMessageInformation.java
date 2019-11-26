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
    public class FlowersOrderMessageInformation implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 留言信息ID
            */
    private Integer omiId;

            /**
            * 订单留言类型id
            */
    private Integer omtId;

            /**
            * 留言信息
            */
    private String omiInformation;

        public Integer getOmiId() {
        return omiId;
        }

            public void setOmiId(Integer omiId) {
        this.omiId = omiId;
        }
        public Integer getOmtId() {
        return omtId;
        }

            public void setOmtId(Integer omtId) {
        this.omtId = omtId;
        }
        public String getOmiInformation() {
        return omiInformation;
        }

            public void setOmiInformation(String omiInformation) {
        this.omiInformation = omiInformation;
        }

    @Override
    public String toString() {
    return "FlowersOrderMessageInformation{" +
            "omiId=" + omiId +
            ", omtId=" + omtId +
            ", omiInformation=" + omiInformation +
    "}";
    }
}
