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
    public class FlowersIntegralType implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 积分类型id
            */
            @TableId(value = "i_type_id", type = IdType.AUTO)
    private Integer iTypeId;

            /**
            * 用户积分id
            */
    private Integer fIId;

            /**
            * 积分类型
            */
    private String iType;

            /**
            * 积分分数
            */
    private Integer iScore;

        public Integer getiTypeId() {
        return iTypeId;
        }

            public void setiTypeId(Integer iTypeId) {
        this.iTypeId = iTypeId;
        }
        public Integer getfIId() {
        return fIId;
        }

            public void setfIId(Integer fIId) {
        this.fIId = fIId;
        }
        public String getiType() {
        return iType;
        }

            public void setiType(String iType) {
        this.iType = iType;
        }
        public Integer getiScore() {
        return iScore;
        }

            public void setiScore(Integer iScore) {
        this.iScore = iScore;
        }

    @Override
    public String toString() {
    return "FlowersIntegralType{" +
            "iTypeId=" + iTypeId +
            ", fIId=" + fIId +
            ", iType=" + iType +
            ", iScore=" + iScore +
    "}";
    }
}
