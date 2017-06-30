package net.duanlang.agent.action;

import net.duanlang.agent.domain.NvShen;
import net.duanlang.agent.domain.YaHuan;

/**
 * Created with IntelliJ IDEA.
 * Author: dh
 * Time: 2017/6/29
 * Description:客户端
 **/
public class Client {
    public static void main(String[] args){
        /**
         * 段郎喜欢王语嫣，由于不熟且见到女神胆怯，于是找到了她的丫鬟，帮他送各种东西给王语嫣
         */
        //有一位女神叫王语嫣（实实在在的对象）
        NvShen wangYuYan=new NvShen("王语嫣");

        //丫鬟，帮段郎追王语嫣
        YaHuan yaHuan=new YaHuan(wangYuYan);
        //丫鬟送玫瑰给王语嫣
        yaHuan.sendRose();
        //送娃娃
        yaHuan.sendDoll();
        //送巧克力
        yaHuan.sendChocolate();
    }
}
