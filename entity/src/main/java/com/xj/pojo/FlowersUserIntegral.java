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
    public class FlowersUserIntegral implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 用户积分id
            */
            @TableId(value = "f_i_id", type = IdType.AUTO)
    private Integer fIId;

            /**
            * 用户id
            */
    private Integer uId;

            /**
            * 积分类型id
            */
    private Integer iId;

            /**
            * 总积分
            */
    private Integer iSumScore;

        public Integer getfIId() {
        return fIId;
        }

            public void setfIId(Integer fIId) {
        this.fIId = fIId;
        }
        public Integer getuId() {
        return uId;
        }

            public void setuId(Integer uId) {
        this.uId = uId;
        }
        public Integer getiId() {
        return iId;
        }

            public void setiId(Integer iId) {
        this.iId = iId;
        }
        public Integer getiSumScore() {
        return iSumScore;
        }

            public void setiSumScore(Integer iSumScore) {
        this.iSumScore = iSumScore;
        }

    @Override
    public String toString() {
    return "FlowersUserIntegral{" +
            "fIId=" + fIId +
            ", uId=" + uId +
            ", iId=" + iId +
            ", iSumScore=" + iSumScore +
    "}";
    }
}
