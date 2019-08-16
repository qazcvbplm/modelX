package ops.model.X.auth;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.io.UnsupportedEncodingException;
import java.sql.Date;

public class JWTUtil {

    private static final long OUT_TIME = 120 * 60 * 1000;

    private static final String SECRET = "f3b9e9ef-08da-4934-901d-d121bd33f515";


    public static String sign(TokenRequest tokenRequest) {
        try {
            Date date = new Date(System.currentTimeMillis() + OUT_TIME);
            Algorithm algorithm = Algorithm.HMAC256(tokenRequest.getSecret());
            return JWT.create()
                    .withClaim("userId", tokenRequest.getUserId())
                    .withClaim("msg", tokenRequest.getExtra().toString())
                    .withExpiresAt(tokenRequest.getOutTime())
                    .sign(algorithm);
        } catch (IllegalArgumentException | UnsupportedEncodingException e) {
            return null;
        }
    }
	/*public String get(String token) {
		if (JWTUtil.verify(token)) {
			DecodedJWT de = JWT.decode(token);
			return de.getClaim("msg").asString();
		} else {
			return null;
		}
	}*/


    public static boolean verify(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            JWT.require(algorithm).build().verify(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
