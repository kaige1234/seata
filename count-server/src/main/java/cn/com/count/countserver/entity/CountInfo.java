package cn.com.count.countserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author sunkai
 * @since 2021-03-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CountInfo对象", description="")
public class CountInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "count_id", type = IdType.AUTO)
    private Long countId;

    private String countName;


}
