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
    public class FlowersCollection implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 收藏ID
            */
            @TableId(value = "f_collection_id", type = IdType.AUTO)
    private Integer fCollectionId;

            /**
            * 鲜花id
            */
    private Integer fFreshId;

            /**
            * 用户id
            */
    private Integer uId;

        public Integer getfCollectionId() {
        return fCollectionId;
        }

            public void setfCollectionId(Integer fCollectionId) {
        this.fCollectionId = fCollectionId;
        }
        public Integer getfFreshId() {
        return fFreshId;
        }

            public void setfFreshId(Integer fFreshId) {
        this.fFreshId = fFreshId;
        }
        public Integer getuId() {
        return uId;
        }

            public void setuId(Integer uId) {
        this.uId = uId;
        }

    @Override
    public String toString() {
    return "FlowersCollection{" +
            "fCollectionId=" + fCollectionId +
            ", fFreshId=" + fFreshId +
            ", uId=" + uId +
    "}";
    }
}
