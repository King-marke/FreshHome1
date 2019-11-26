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
    public class FlowersSaysType implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 花语类型id
            */
            @TableId(value = "f_says_id", type = IdType.AUTO)
    private Integer fSaysId;

            /**
            * 花语类型
            */
    private String fSaysType;

        public Integer getfSaysId() {
        return fSaysId;
        }

            public void setfSaysId(Integer fSaysId) {
        this.fSaysId = fSaysId;
        }
        public String getfSaysType() {
        return fSaysType;
        }

            public void setfSaysType(String fSaysType) {
        this.fSaysType = fSaysType;
        }

    @Override
    public String toString() {
    return "FlowersSaysType{" +
            "fSaysId=" + fSaysId +
            ", fSaysType=" + fSaysType +
    "}";
    }
}
