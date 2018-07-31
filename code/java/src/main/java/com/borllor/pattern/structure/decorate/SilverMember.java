package com.borllor.pattern.structure.decorate;

/**
 * Created by borllor on 2017/11/26.
 */
public class SilverMember extends Member {
    public boolean login() {
        boolean passed = false;
        if (passed) {
            //TODO：针对银牌会员其它行为
            System.out.println("登录成功");
            return true;
        } else {
            return false;
        }
    }
}
