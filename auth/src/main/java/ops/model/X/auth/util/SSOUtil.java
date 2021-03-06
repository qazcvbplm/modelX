package ops.model.X.auth.util;

import com.baomidou.kisso.SSOHelper;
import com.baomidou.kisso.security.token.SSOToken;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SSOUtil {

    public static void login(HttpServletRequest request, HttpServletResponse response, Object id, String Issuer) {
        // 设置登录 COOKIE
        SSOHelper.setCookie(request, response, SSOToken.create().setIp(request).setId(id).setIssuer(Issuer), false);
    }

    public static Object token(HttpServletRequest request) {
        return SSOHelper.attrToken(request);
    }
}
