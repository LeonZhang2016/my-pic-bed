package com.i61.eos.lp.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 启用/上海/上海运营平台部-LP组/张慧源/张慧源-学生基础信息表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "stu_base")
public class StuBase implements Serializable {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 学员统一标识ID
     */
    @TableField(value = "uuid")
    private Long uuid;

    /**
     * 姓名
     */
    @TableField(value = "stu_name")
    private String stuName;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 微信昵称
     */
    @TableField(value = "wx_nick")
    private String wxNick;

    /**
     * 微信头像
     */
    @TableField(value = "wx_avatar")
    private String wxAvatar;

    /**
     * 手机号部分号码隐藏
     */
    @TableField(value = "mobile_dim")
    private String mobileDim;

    /**
     * 手机号加密串
     */
    @TableField(value = "mobile_encrypt")
    private String mobileEncrypt;

    /**
     * 家长姓名
     */
    @TableField(value = "parent_name")
    private String parentName;

    /**
     * 家长关系
     */
    @TableField(value = "parent_relation")
    private Byte parentRelation;

    /**
     * 生日
     */
    @TableField(value = "birthday")
    private Date birthday;

    /**
     * 就读班级
     */
    @TableField(value = "attend_class")
    private Byte attendClass;

    /**
     * 测试学员标识0否1是
     */
    @TableField(value = "test_user_flag")
    private Byte testUserFlag;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 手机区号
     */
    @TableField(value = "mobile_area")
    private Integer mobileArea;

    /**
     * 上次打卡时间
     */
    @TableField(value = "last_card_time")
    private Date lastCardTime;

    /**
     * 上周打卡时间
     */
    @TableField(value = "last_week_card_time")
    private Date lastWeekCardTime;

    /**
     * 本周打卡时间
     */
    @TableField(value = "now_week_card_time")
    private Date nowWeekCardTime;

    /**
     * 本周打卡状态
     */
    @TableField(value = "nw_card_status")
    private Byte nwCardStatus;

    /**
     * 已打卡次数
     */
    @TableField(value = "punch_card_num")
    private Integer punchCardNum;

    /**
     * 朋友圈状态
     */
    @TableField(value = "friend_circle_status")
    private Byte friendCircleStatus;

    /**
     * 是否海外，0：否；1-是
     */
    @TableField(value = "oversea")
    private Byte oversea;

    /**
     * 国家及地区编码，86：中国
     */
    @TableField(value = "area_code")
    private Integer areaCode;

    /**
     * 国家地区
     */
    @TableField(value = "country")
    private String country;

    /**
     * 省份
     */
    @TableField(value = "province")
    private String province;

    /**
     * 城市
     */
    @TableField(value = "city")
    private String city;

    /**
     * 时区
     */
    @TableField(value = "time_zone")
    private Integer timeZone;

    /**
     * 时差
     */
    @TableField(value = "time_diff")
    private Integer timeDiff;

    private static final long serialVersionUID = 1L;
}