package net.zlw.cloud.designProject.mapper;


import net.zlw.cloud.designProject.model.Budgeting;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;


@org.apache.ibatis.annotations.Mapper
public interface BudgetingMapper extends Mapper<Budgeting> {

}
