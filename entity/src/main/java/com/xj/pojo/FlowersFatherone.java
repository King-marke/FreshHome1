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
    public class FlowersFatherone implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 鲜花,永生花,礼品
            */
            @TableId(value = "fly_id", type = IdType.AUTO)
    private Integer flyId;

    private String flyName;

        public Integer getFlyId() {
        return flyId;
        }

            public void setFlyId(Integer flyId) {
        this.flyId = flyId;
        }
        public String getFlyName() {
        return flyName;
        }

            public void setFlyName(String flyName) {
        this.flyName = flyName;
        }

    @Override
    public String toString() {
    return "FlowersFatherone{" +
            "flyId=" + flyId +
            ", flyName=" + flyName +
    "}";
    }
}
