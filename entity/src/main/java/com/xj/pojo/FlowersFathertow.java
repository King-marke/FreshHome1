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
    public class FlowersFathertow implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "fly_tow_id", type = IdType.AUTO)
    private Integer flyTowId;

    private String flyTowName;

        public Integer getFlyTowId() {
        return flyTowId;
        }

            public void setFlyTowId(Integer flyTowId) {
        this.flyTowId = flyTowId;
        }
        public String getFlyTowName() {
        return flyTowName;
        }

            public void setFlyTowName(String flyTowName) {
        this.flyTowName = flyTowName;
        }

    @Override
    public String toString() {
    return "FlowersFathertow{" +
            "flyTowId=" + flyTowId +
            ", flyTowName=" + flyTowName +
    "}";
    }
}
