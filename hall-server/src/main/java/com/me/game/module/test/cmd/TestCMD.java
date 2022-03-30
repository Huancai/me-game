package com.me.game.module.test.cmd;

import com.me.common.net.Cmd;
import com.me.common.net.InCmd;
import com.me.common.net.OutCmd;
import com.me.game.common.cmd.AbstractCMD;
import com.me.game.module.misc.data.GamePlayer;
import com.me.metadata.pb.test.TestMsgProto;

/**
 * @author wu_hc 【whuancai@163.com】
 */
@Cmd(code = InCmd.TEST, desc = "这是一个测试的cmd")
public class TestCMD extends AbstractCMD<TestMsgProto.TestReqProto> {
    @Override
    protected void execute(GamePlayer player, TestMsgProto.TestReqProto message) {
        TestMsgProto.TestRspProto.Builder builder = TestMsgProto.TestRspProto.newBuilder();
        builder.setId(message.getId());
        builder.setMsg("ok");
        builder.setUserName(message.getUserName());
        builder.setPassWorld(message.getPassWorld());
        player.send(OutCmd.TEST, builder);
    }

    @Cmd(code = 45)
    public void test() {

    }
}
