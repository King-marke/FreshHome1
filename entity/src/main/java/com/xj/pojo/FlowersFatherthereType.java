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
    public class FlowersFatherthereType implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "fly_type_id", type = IdType.AUTO)
    private Integer flyTypeId;

    private Integer flyId;

    private Integer flyTwoId;

    private String flyTypeContent;

        public Integer getFlyTypeId() {
        return flyTypeId;
        }

            public void setFlyTypeId(Integer flyTypeId) {
        this.flyTypeId = flyTypeId;
        }
        public Integer getFlyId() {
        return flyId;
        }

            public void setFlyId(Integer flyId) {
        this.flyId = flyId;
        }
        public Integer getFlyTwoId() {
        return flyTwoId;
        }

            public void setFlyTwoId(Integer flyTwoId) {
        this.flyTwoId = flyTwoId;
        }
        public String getFlyTypeContent() {
        return flyTypeContent;
        }

            public void setFlyTypeContent(String flyTypeContent) {
        this.flyTypeContent = flyTypeContent;
        }

    @Override
    public String toString() {
    return "FlowersFatherthereType{" +
            "flyTypeId=" + flyTypeId +
            ", flyId=" + flyId +
            ", flyTwoId=" + flyTwoId +
            ", flyTypeContent=" + flyTypeContent +
    "}";
    }
}
