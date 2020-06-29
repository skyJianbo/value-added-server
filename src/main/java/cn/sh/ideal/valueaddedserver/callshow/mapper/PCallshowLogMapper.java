package cn.sh.ideal.valueaddedserver.callshow.mapper;

import cn.sh.ideal.valueaddedserver.callshow.entity.PCallshowLog;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface PCallshowLogMapper {
    int deleteByPrimaryKey(Integer autoid);

    int insert(PCallshowLog record);

    int insertSelective(PCallshowLog record);

    PCallshowLog selectByPrimaryKey(Integer autoid);

    int updateByPrimaryKeySelective(PCallshowLog record);

    int updateByPrimaryKey(PCallshowLog record);
}