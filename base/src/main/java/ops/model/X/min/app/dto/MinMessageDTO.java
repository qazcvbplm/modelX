package ops.model.X.min.app.dto;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import ops.model.X.min.app.entity.MinApp;
import ops.model.X.min.app.entity.MinMessage;

public class MinMessageDTO {

    private String appId;

    private String secret;

    private String toUser;

    private String templateId;

    private String formId;

    private Data data;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


    public MinMessageDTO(MinApp minApp, MinMessage minMessage, String toUser, String formId, Data data) {
        this.appId = minApp.getAppId();
        this.secret = minApp.getSecret();
        this.toUser = toUser;
        this.templateId = minMessage.getTemplateId();
        this.formId = formId;
        this.data = data;
    }

    public static class Data {
        private KeyWord first;
        private KeyWord remark;
        private KeyWord keyword1;
        private KeyWord keyword2;
        private KeyWord keyword3;
        private KeyWord keyword4;
        private KeyWord keyword5;
        private KeyWord keyword6;
        private KeyWord keyword7;
        private KeyWord keyword8;
        private KeyWord keyword9;

        public KeyWord getFirst() {
            return first;
        }

        public void setFirst(KeyWord first) {
            this.first = first;
        }

        public KeyWord getRemark() {
            return remark;
        }

        public void setRemark(KeyWord remark) {
            this.remark = remark;
        }

        public static Data getData(String... params) {
            int length = params.length;
            JSONObject data = new JSONObject();
            JSONObject keyword = null;
            for (int i = 0; i < length; i++) {
                keyword = new JSONObject();
                keyword.put("value", params[i]);
                keyword.put("color", "#173177");
                data.put("keyword" + (i + 1), keyword);
            }
            return JSON.parseObject(data.toString(), Data.class);
        }

        public static Data getData(String first, String remark, String... params) {
            int length = params.length;
            JSONObject data = new JSONObject();
            JSONObject keyword = null;
            if (first != null) {
                keyword = new JSONObject();
                keyword.put("value", first);
                keyword.put("color", "#173177");
                data.put("first", keyword);
            }
            for (int i = 0; i < length; i++) {
                keyword = new JSONObject();
                keyword.put("value", params[i]);
                keyword.put("color", "#173177");
                data.put("keyword" + (i + 1), keyword);
            }
            if (remark != null) {
                keyword = new JSONObject();
                keyword.put("value", remark);
                keyword.put("color", "#173177");
                data.put("remark", keyword);
            }
            return JSON.parseObject(data.toString(), Data.class);
        }


        public KeyWord getKeyword1() {
            return keyword1;
        }

        public void setKeyword1(KeyWord keyword1) {
            this.keyword1 = keyword1;
        }

        public KeyWord getKeyword2() {
            return keyword2;
        }

        public void setKeyword2(KeyWord keyword2) {
            this.keyword2 = keyword2;
        }

        public KeyWord getKeyword3() {
            return keyword3;
        }

        public void setKeyword3(KeyWord keyword3) {
            this.keyword3 = keyword3;
        }

        public KeyWord getKeyword4() {
            return keyword4;
        }

        public void setKeyword4(KeyWord keyword4) {
            this.keyword4 = keyword4;
        }

        public KeyWord getKeyword5() {
            return keyword5;
        }

        public void setKeyword5(KeyWord keyword5) {
            this.keyword5 = keyword5;
        }

        public KeyWord getKeyword6() {
            return keyword6;
        }

        public void setKeyword6(KeyWord keyword6) {
            this.keyword6 = keyword6;
        }

        public KeyWord getKeyword7() {
            return keyword7;
        }

        public void setKeyword7(KeyWord keyword7) {
            this.keyword7 = keyword7;
        }

        public KeyWord getKeyword8() {
            return keyword8;
        }

        public void setKeyword8(KeyWord keyword8) {
            this.keyword8 = keyword8;
        }

        public KeyWord getKeyword9() {
            return keyword9;
        }

        public void setKeyword9(KeyWord keyword9) {
            this.keyword9 = keyword9;
        }


    }


    public static class KeyWord {

        private String value;

        private String color = "#173177";

        public KeyWord(String value, String color) {
            this.value = value;
            this.color = color;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public KeyWord(String value) {
            this.value = value;
        }
    }
}
