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
    public class FlowersPicture implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 鲜花图片ID
            */
            @TableId(value = "f_picture_id", type = IdType.AUTO)
    private Integer fPictureId;

            /**
            * 鲜花id
            */
    private Integer fFreshId;

            /**
            * 鲜花图片
            */
    private String fPicture;

        public Integer getfPictureId() {
        return fPictureId;
        }

            public void setfPictureId(Integer fPictureId) {
        this.fPictureId = fPictureId;
        }
        public Integer getfFreshId() {
        return fFreshId;
        }

            public void setfFreshId(Integer fFreshId) {
        this.fFreshId = fFreshId;
        }
        public String getfPicture() {
        return fPicture;
        }

            public void setfPicture(String fPicture) {
        this.fPicture = fPicture;
        }

    @Override
    public String toString() {
    return "FlowersPicture{" +
            "fPictureId=" + fPictureId +
            ", fFreshId=" + fFreshId +
            ", fPicture=" + fPicture +
    "}";
    }
}
