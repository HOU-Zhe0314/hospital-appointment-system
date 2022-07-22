package zh.hospital.common.utils;


import zh.hospital.common.helper.JwtHelper;

import javax.servlet.http.HttpServletRequest;

//获取当前用户信息工具类
public class AuthContextHolder {

    public static Long getUserId(HttpServletRequest request) {
        String token = request.getHeader("token");
        Long userId = JwtHelper.getUserId(token);
        return userId;
    }

    public static String getUserName(HttpServletRequest request) {
        String token = request.getHeader("token");
        String userName = JwtHelper.getUserName(token);
        return userName;
    }
}
