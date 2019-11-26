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
    public class FlowersTongyongimg implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "ty_id", type = IdType.AUTO)
    private Integer tyId;

    private String tyImg;

    private Integer flyId;

        public Integer getTyId() {
        return tyId;
        }

            public void setTyId(Integer tyId) {
        this.tyId = tyId;
        }
        public String getTyImg() {
        return tyImg;
        }

            public void setTyImg(String tyImg) {
        this.tyImg = tyImg;
        }
        public Integer getFlyId() {
        return flyId;
        }

            public void setFlyId(Integer flyId) {
        this.flyId = flyId;
        }

    @Override
    public String toString() {
    return "FlowersTongyongimg{" +
            "tyId=" + tyId +
            ", tyImg=" + tyImg +
            ", flyId=" + flyId +
    "}";
    }
}
