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
    public class FlowersShopping implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 购物车商品ID
            */
            @TableId(value = "s_id", type = IdType.AUTO)
    private Integer sId;

            /**
            * 鲜花id
            */
    private Integer fFreshId;

            /**
            * 商品数量
            */
    private Integer fSum;

        public Integer getsId() {
        return sId;
        }

            public void setsId(Integer sId) {
        this.sId = sId;
        }
        public Integer getfFreshId() {
        return fFreshId;
        }

            public void setfFreshId(Integer fFreshId) {
        this.fFreshId = fFreshId;
        }
        public Integer getfSum() {
        return fSum;
        }

            public void setfSum(Integer fSum) {
        this.fSum = fSum;
        }

    @Override
    public String toString() {
    return "FlowersShopping{" +
            "sId=" + sId +
            ", fFreshId=" + fFreshId +
            ", fSum=" + fSum +
    "}";
    }
}
