package com.me.common.worker.select;

import com.me.common.worker.Worker;
import com.me.common.worker.WorkerGroup.SelectStrategy;

/**
 * 选择策略工厂
 *
 * @author wu_hc 【whuancai@163.com】
 */
public interface ChooserStrategyFactory {

    /**
     * @param executors 工作线程数组
     * @return
     */
    EventLoopChooser newChooser(Worker[] executors);

    /**
     * @param executors 工作线程数组
     * @param strategy  策略
     * @return
     */
    EventLoopChooser newChooser(Worker[] executors, SelectStrategy strategy);

    /**
     * 选择策略器
     */
    interface EventLoopChooser {

        Worker next();
    }
}
