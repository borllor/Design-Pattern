package com.borllor.pattern.structure.decorate;

/**
 * Created by borllor on 2017/11/26.
 */
public class UnsafeMember extends Member {
    private Member m_Member;

    public UnsafeMember(Member member) {
        this.m_Member = member;
    }

    public boolean login() {
        //TODO: 手机验证码验证
        if (m_Member.login()) {

            return false;
        } else {
            //TODO: 判断是否达到登录相关错误阀值
            //TODO: 达到后，把用户加入黑名单
            return true;
        }
    }
}
