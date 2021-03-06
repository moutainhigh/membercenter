package org.smartwork.comm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 团队用户Dto
 */
@Data
@ApiModel(value = "团队中用户参数")
public class ZGTeamRelUserDto implements Serializable{

    private static final long serialVersionUID = -6321946076691009308L;

    /**
     * id
     * <p>
     * Table:     fb_zg_team_attach
     * Column:    id
     * Nullable:  true
     */
    @ApiModelProperty(value = "id,添加不传值", example = "0")
    private Long id;

    /**
     * 团队ID
     *
     * Table:     fb_zg_team_rel_user
     * Column:    team_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "团队ID",example="0")
    private Long teamId;

    /**
     * 用户ID
     *
     * Table:     fb_zg_team_rel_user
     * Column:    user_id
     * Nullable:  true
     */
    @ApiModelProperty(value = "用户ID",example="0")
    private Long userId;

    /**
     * 用户名
     *
     * Table:     fb_zg_team_rel_user
     * Column:    user_name
     * Nullable:  true
     */
    @ApiModelProperty(value = "用户名",example="")
    private String userName;

    /**
     * 0-否1-是
     *
     * Table:     fb_zg_team_rel_user
     * Column:    admin_flag
     * Nullable:  true
     */
    @ApiModelProperty(value = "0-否1-是",example="")
    private Integer adminFlag;

    /**
     * 负责方向：比如前端、后端
     *
     * Table:     fb_zg_team_rel_user
     * Column:    direction
     * Nullable:  true
     */
    @ApiModelProperty(value = "负责方向：比如前端、后端",example="")
    private String direction;

}
