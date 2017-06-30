package net.duanlang.agent.domain;

/**
 * Created with IntelliJ IDEA.
 * Author: dh
 * Time: 2017/6/29
 * Description:段郎（被代理类），喜欢女神，但是比较腼腆
 **/
public class DuanLang implements SendGift{
    private NvShen nvShen;
    public DuanLang(NvShen nvShen){
        this.nvShen=nvShen;
    }
    /**
     * 送玫瑰花
     */
    @Override
    public void sendRose() {
        System.out.println("给"+nvShen.getName()+"送玫瑰");
    }

    /**
     * 送娃娃
     */
    @Override
    public void sendDoll() {
        System.out.println("给"+nvShen.getName()+"送娃娃");
    }

    /**
     * 送巧克力
     */
    @Override
    public void sendChocolate() {
        System.out.println("给"+nvShen.getName()+"送巧克力");
    }
}
