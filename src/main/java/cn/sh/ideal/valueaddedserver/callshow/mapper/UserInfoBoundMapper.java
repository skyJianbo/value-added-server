package cn.sh.ideal.valueaddedserver.callshow.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserInfoBoundMapper {
    /**
     * 根据openId查询用户是否为绑定用户
     * @param openId
     * @return
     */
    Map<String, String> queryIsBound(String openId);
}
