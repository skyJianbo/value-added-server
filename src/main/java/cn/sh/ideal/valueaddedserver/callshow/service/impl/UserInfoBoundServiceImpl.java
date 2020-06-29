package cn.sh.ideal.valueaddedserver.callshow.service.impl;

import cn.sh.ideal.valueaddedserver.common.util.QueryPackageUseUtil;
import cn.sh.ideal.valueaddedserver.common.util.StringUtil;
import cn.sh.ideal.valueaddedserver.callshow.mapper.UserInfoBoundMapper;
import cn.sh.ideal.valueaddedserver.callshow.service.UserInfoBoundService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class UserInfoBoundServiceImpl implements UserInfoBoundService {

    @Autowired
    private UserInfoBoundMapper userInfoBoundMapper;

    @Override
    public Map<String, String> queryIsBound(String openId) {
        Map<String, String> map=new HashMap<>();
        log.info("进入验证用户绑定方法,查询用户是否绑定");
        try {
            // 解密微信
        openId = QueryPackageUseUtil.replacePassEncode(openId.replaceAll("%3D", "="));

            log.info("未解密的openId：" + openId + ",解密后的openId:" + openId);
            // 查询用户是否绑定
            map = userInfoBoundMapper.queryIsBound(openId);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
