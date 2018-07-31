package com.borllor.pattern.behavior.observe.impl1;

/**
 * Created by borllor on 2017/11/26.
 */
public class Order {
    public void create() {
        orderStatusChange("创单成功");
    }

    public void pay() {
        orderStatusChange("支付成功");
    }

    public void refund() {
        orderStatusChange("申请退票成功");
    }

    public void orderStatusChange(String status) {
        //系统取消座位
        new BookingSeat().cancelSeat();
        //通知财务部门退款
        new FinanceDept().refund();
        //发短信告诉客人退票成功
        new SMS().sendSMS();

        //有什么问题吗？
        //而且和具体的消费对象耦合在一起了
        //如果需要新增一个订单状态变更的对象，需要修改此处代码(违反了开放封闭原则)
        //如何改进呢？
    }
}
