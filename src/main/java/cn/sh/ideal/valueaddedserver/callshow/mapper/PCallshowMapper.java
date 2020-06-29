package cn.sh.ideal.valueaddedserver.callshow.mapper;

import cn.sh.ideal.valueaddedserver.callshow.entity.PCallshow;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PCallshowMapper {
    int deleteByPrimaryKey(Integer autoid);

    int insert(PCallshow record);

    int insertSelective(PCallshow record);

    PCallshow selectByPrimaryKey(Integer autoid);

    int updateByPrimaryKeySelective(PCallshow record);

    int updateByPrimaryKey(PCallshow record);
}