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
    public class FlowersFatherthereMaterial implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "fly_material_id", type = IdType.AUTO)
    private Integer flyMaterialId;

    private Integer flyId;

    private String flyMaterialContent;

        public Integer getFlyMaterialId() {
        return flyMaterialId;
        }

            public void setFlyMaterialId(Integer flyMaterialId) {
        this.flyMaterialId = flyMaterialId;
        }
        public Integer getFlyId() {
        return flyId;
        }

            public void setFlyId(Integer flyId) {
        this.flyId = flyId;
        }
        public String getFlyMaterialContent() {
        return flyMaterialContent;
        }

            public void setFlyMaterialContent(String flyMaterialContent) {
        this.flyMaterialContent = flyMaterialContent;
        }

    @Override
    public String toString() {
    return "FlowersFatherthereMaterial{" +
            "flyMaterialId=" + flyMaterialId +
            ", flyId=" + flyId +
            ", flyMaterialContent=" + flyMaterialContent +
    "}";
    }
}
