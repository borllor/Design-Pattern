package com.borllor.pattern.structure.decorate;

/**
 * Created by borllor on 2017/11/26.
 */
public class Member618 extends Member {
    private Member m_Member;

    public Member618(Member member) {
        this.m_Member = member;
    }

    public boolean login() {
        if (m_Member.login()) {
            //TODO: 如果登录的时间是6月18号，并且是今天第一次登录网站
            //TODO: 给用户增加100个金币
            //TODO: 增加客户的忠诚指数2分
            return true;
        } else {
            return false;
        }
    }
}
