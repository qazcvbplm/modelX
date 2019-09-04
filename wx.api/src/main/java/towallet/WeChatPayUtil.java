/*    */
package towallet;


import util.XMLUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class WeChatPayUtil {


    /**
     * @param appid
     * @param mch_id
     * @param paykey
     * @param cert
     * @param payId
     * @param ip
     * @param amount
     * @param openId
     * @return
     * @throws Exception
     */
    public static void transfers(String appid, String mch_id, String paykey, String cert, String payId, String ip, BigDecimal amount, String openId) throws Exception {
        String[] uiids = null;
        String nonceStr = WeChatUtil.getNonceStr();
        Map<String, String> map = null;
        List<Map<String, String>> list = new ArrayList();
        TreeMap<String, String> parms = new TreeMap();
        parms.put("mch_appid", appid);
        parms.put("mchid", mch_id);
        parms.put("nonce_str", nonceStr);
        parms.put("partner_trade_no", WeChatUtil.getPartnerTradeNo(payId));
        parms.put("amount", WeChatUtil.bigDecimalToPoint(amount));
        parms.put("desc", "提现款额");
        parms.put("spbill_create_ip", ip);
        parms.put("openid", openId);
        parms.put("check_name", "NO_CHECK");
        WeChatConfig.API_KEY = paykey;
        WeChatConfig.MCHID = mch_id;
        WeChatConfig.CA_LICENSE = cert;
        parms.put("sign", SignTools.buildRequestMysign(parms));
        String resultXML = HttpClientCustomSSL.httpClientResult(parms);
        Map<String, Object> resultMap = XMLUtil.doXMLParse(resultXML);
        String return_code = (String) resultMap.get("return_code");
        String result_code = (String) resultMap.get("result_code");
        if ((!return_code.equalsIgnoreCase("SUCCESS"))
                || (!result_code.equalsIgnoreCase("SUCCESS"))) {
            throw new RuntimeException(resultMap.get("return_msg").toString());
        }

    }
}

