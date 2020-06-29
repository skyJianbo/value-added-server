package cn.sh.ideal.valueaddedserver.callshow.entity;

import lombok.Data;

import java.util.Date;
@Data
public class PCallshow {
    private Integer autoid; //主键ID

    private String openid;//微信ID

    private String deviceno;//设备号

    private String username;//用户名

    private String usernumber;//客户号

    private String crmorderno;//crm订单号

    private String serianumber;//订单流水号

    private String crmstatus;//0订单已提交 1订单办理成功 2订单办理失败 订单状态

    private Date createtime;//创建时间

    private String crmresp;//接口回调返回信息

    private String bustype;//业务类型 开通or关闭
}