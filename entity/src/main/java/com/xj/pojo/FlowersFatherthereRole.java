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
    public class FlowersFatherthereRole implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "fly_role_id", type = IdType.AUTO)
    private Integer flyRoleId;

    private Integer flyId;

    private Integer flyTwoId;

    private String flyRoleContent;

        public Integer getFlyRoleId() {
        return flyRoleId;
        }

            public void setFlyRoleId(Integer flyRoleId) {
        this.flyRoleId = flyRoleId;
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
        public String getFlyRoleContent() {
        return flyRoleContent;
        }

            public void setFlyRoleContent(String flyRoleContent) {
        this.flyRoleContent = flyRoleContent;
        }

    @Override
    public String toString() {
    return "FlowersFatherthereRole{" +
            "flyRoleId=" + flyRoleId +
            ", flyId=" + flyId +
            ", flyTwoId=" + flyTwoId +
            ", flyRoleContent=" + flyRoleContent +
    "}";
    }
}
