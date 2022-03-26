package com.me.game.module.test;

import com.me.game.middleware.component.AbstractComponent;
import com.me.game.middleware.component.ComponentType;
import com.me.game.middleware.component.MeComponent;
import com.me.game.module.misc.data.GameUnit;
import com.me.metadata.db.entity.TestEntity;

/**
 * @author wu_hc 【whuancai@163.com】
 */
@MeComponent(type = ComponentType.TEST, desc = "test component")
public class TestComponent extends AbstractComponent {

    private TestEntity testEntity;

    public TestComponent(GameUnit owner) {
        super(owner);
    }

    @Override
    public void prepareData() {
        testEntity = new TestEntity();
    }

    @Override
    public void prepareSaveData() {
        trust(testEntity);
    }
}
