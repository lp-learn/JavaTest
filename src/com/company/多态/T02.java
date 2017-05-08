package com.company.多态;

/**
 * Created by OKMAN on 2017/5/8.
 */
class 爸爸 {
    爸爸 协变返回类型() {
        return new 爸爸();
    }
}

class 儿子 extends  爸爸{
    儿子 协变返回类型() {
        return new 儿子();
    }
}

public class T02 {
}
