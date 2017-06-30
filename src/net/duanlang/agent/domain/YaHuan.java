package net.duanlang.agent.domain;

/**
 * Created with IntelliJ IDEA.
 * Author: dh
 * Time: 2017/6/29
 * Description:丫鬟(代理类)，帮段郎追女神，段郎的代理
 **/
public class YaHuan implements  SendGift{
    /**
     * 闺蜜类关联段郎类，也就是说：代理类关联被代理类
     */
    private DuanLang duanLang;
    public YaHuan(NvShen nvShen){
        this.duanLang=new DuanLang(nvShen);
    }
    /**
     * 送玫瑰花
     */
    @Override
    public void sendRose() {
        duanLang.sendRose();
    }

    /**
     * 送娃娃
     */
    @Override
    public void sendDoll() {
        duanLang.sendDoll();
    }

    /**
     * 送巧克力
     */
    @Override
    public void sendChocolate() {
        duanLang.sendRose();
    }
}
