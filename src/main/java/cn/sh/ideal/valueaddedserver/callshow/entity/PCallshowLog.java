package cn.sh.ideal.valueaddedserver.callshow.entity;

import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class PCallshowLog {
    private Integer autoid;

    private Object openid;

    private String username;

    private String deviceno;

    private String methodname;

    private String description;

    private String status;

    private Date createtime;

    public PCallshowLog() {

    }

    public PCallshowLog(String smethodname, String description, String status) {
        this.methodname = methodname;
        this.description = description;
        this.status = status;
    }

    public PCallshowLog(String deviceNo, String userId, String userName, String methodname, String description, String status) {
        this.deviceno=deviceNo;
        this.openid=userId;
        this.username=userName;
        this.methodname = methodname;
        this.description = description;
        this.status = status;
    }

    @Override
    public String toString() {
        return "PCallshowLog{" +
                "autoid=" + autoid +
                ", openid=" + openid +
                ", username='" + username + '\'' +
                ", deviceno='" + deviceno + '\'' +
                ", methodname='" + methodname + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", createtime=" + createtime +
                '}';
    }

    public PCallshowLog(Map<String, String> map, String methodname, String description, String status) {
        this.openid = map.get("WECHAT_ID");
        this.username = map.get("CUSTOMER_NAME");
        this.deviceno = map.get("TELEPHONE");
        this.methodname = methodname;
        this.description = description;
        this.status = status;
    }

}