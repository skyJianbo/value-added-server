package cn.sh.ideal.valueaddedserver.callshow.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public interface UserInfoBoundService {
    Map<String, String> queryIsBound(String openid);
}
