package org.smartwork.comm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author lzw
 * @date 2020/3/16 14:11
 */
@Data
@ApiModel(description="公司用户中间表dto")
public class ZGCmRelUserDto implements Serializable {

    private static final long serialVersionUID = 6992467856733867598L;

    /**
     * 公司ID
     *
     * Table:     fb_zg_cm_rel_user
     * Column:    cm_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "公司ID",example="0")
    private Long cmId;

    /**
     * 用户ID
     *
     * Table:     fb_zg_cm_rel_user
     * Column:    user_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "用户ID",example="0")
    private Long userId;

    /**
     * 岗位ID
     *
     * Table:     fb_zg_cm_rel_user
     * Column:    post_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "岗位ID",example="0")
    private Long postId;

    /**
     * 用户名
     *
     * Table:     fb_zg_cm_rel_user
     * Column:    user_name
     * Nullable:  true
     */
    @ApiModelProperty(value = "用户名",example="")
    private String userName;

    /**
     * 0-否1-是
     *
     * Table:     fb_zg_cm_rel_user
     * Column:    admin_flag
     * Nullable:  true
     */
    @ApiModelProperty(value = "0-否1-是",example="")
    private Byte adminFlag;
}