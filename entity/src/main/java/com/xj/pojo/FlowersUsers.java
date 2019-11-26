package com.xj.pojo;

    import com.baomidou.mybatisplus.annotation.IdType;
    import java.time.LocalDate;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author XQK
* @since 2019-11-23
*/
    public class FlowersUsers implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 用户ID
            */
            @TableId(value = "u_id", type = IdType.AUTO)
    private Integer uId;

            /**
            * 用户真实姓名
            */
    private String uName;

            /**
            * 用户密码
            */
    private String uPassword;

            /**
            * 用户手机
            */
    private String uPhone;

            /**
            * 注册日期
            */
    private LocalDateTime uRegistrationDate;

            /**
            * 用户邮箱
            */
    private String uEmail;

            /**
            * 生日
            */
    private LocalDate uBirthday;

            /**
            * 性别
            */
    private String uSex;

            /**
            * 头像
            */
    private String uHeadPortrait;

            /**
            * 是否时管理员
            */
    private String uIsadmin;

        public Integer getuId() {
        return uId;
        }

            public void setuId(Integer uId) {
        this.uId = uId;
        }
        public String getuName() {
        return uName;
        }

            public void setuName(String uName) {
        this.uName = uName;
        }
        public String getuPassword() {
        return uPassword;
        }

            public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
        }
        public String getuPhone() {
        return uPhone;
        }

            public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
        }
        public LocalDateTime getuRegistrationDate() {
        return uRegistrationDate;
        }

            public void setuRegistrationDate(LocalDateTime uRegistrationDate) {
        this.uRegistrationDate = uRegistrationDate;
        }
        public String getuEmail() {
        return uEmail;
        }

            public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
        }
        public LocalDate getuBirthday() {
        return uBirthday;
        }

            public void setuBirthday(LocalDate uBirthday) {
        this.uBirthday = uBirthday;
        }
        public String getuSex() {
        return uSex;
        }

            public void setuSex(String uSex) {
        this.uSex = uSex;
        }
        public String getuHeadPortrait() {
        return uHeadPortrait;
        }

            public void setuHeadPortrait(String uHeadPortrait) {
        this.uHeadPortrait = uHeadPortrait;
        }
        public String getuIsadmin() {
        return uIsadmin;
        }

            public void setuIsadmin(String uIsadmin) {
        this.uIsadmin = uIsadmin;
        }

    @Override
    public String toString() {
    return "FlowersUsers{" +
            "uId=" + uId +
            ", uName=" + uName +
            ", uPassword=" + uPassword +
            ", uPhone=" + uPhone +
            ", uRegistrationDate=" + uRegistrationDate +
            ", uEmail=" + uEmail +
            ", uBirthday=" + uBirthday +
            ", uSex=" + uSex +
            ", uHeadPortrait=" + uHeadPortrait +
            ", uIsadmin=" + uIsadmin +
    "}";
    }
}
