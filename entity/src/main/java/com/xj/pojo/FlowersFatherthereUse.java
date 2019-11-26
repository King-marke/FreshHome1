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
    public class FlowersFatherthereUse implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "fly_use_id", type = IdType.AUTO)
    private Integer flyUseId;

    private Integer flyId;

    private Integer flyTwoId;

    private String flyContent;

        public Integer getFlyUseId() {
        return flyUseId;
        }

            public void setFlyUseId(Integer flyUseId) {
        this.flyUseId = flyUseId;
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
        public String getFlyContent() {
        return flyContent;
        }

            public void setFlyContent(String flyContent) {
        this.flyContent = flyContent;
        }

    @Override
    public String toString() {
    return "FlowersFatherthereUse{" +
            "flyUseId=" + flyUseId +
            ", flyId=" + flyId +
            ", flyTwoId=" + flyTwoId +
            ", flyContent=" + flyContent +
    "}";
    }
}
