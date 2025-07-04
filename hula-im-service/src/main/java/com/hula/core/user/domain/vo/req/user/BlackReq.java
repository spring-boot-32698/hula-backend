package com.hula.core.user.domain.vo.req.user;

import com.hula.domain.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import jakarta.validation.constraints.NotNull;

/**
 * @author nyh
 */
@Data
public class BlackReq extends BaseEntity {

    @NotNull(message = "请选择拉黑用户")
    @Schema(description = "拉黑用户的uid")
    private Long uid;

	@NotNull(message = "请输入截止时间")
	@Schema(description = "截止时间, 分钟")
	private Long deadline;
}
