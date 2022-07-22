package zh.hospital.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import zh.hospital.model.order.OrderInfo;
import zh.hospital.vo.order.OrderCountQueryVo;
import zh.hospital.vo.order.OrderCountVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper extends BaseMapper<OrderInfo> {

    //查询预约统计数据的方法
    List<OrderCountVo> selectOrderCount(@Param("vo") OrderCountQueryVo orderCountQueryVo);
}
