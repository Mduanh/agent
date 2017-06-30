package net.duanlang.agent.domain;

/**
 * Created with IntelliJ IDEA.
 * Author: dh
 * Time: 2017/6/29
 * Description:送礼物接口(对动作的抽象)
 **/
public interface SendGift {
    /**
     * 送玫瑰花
     */
    public void sendRose();
    /**
     * 送娃娃
     */
    public void sendDoll();
    /**
     * 送巧克力
     */
    public void sendChocolate();
}
