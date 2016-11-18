package com.virjar.dungproxy.client.ippool.strategy;

import com.virjar.dungproxy.client.model.Score;

/**
 * Created by virjar on 16/10/1.
 */
public interface Offline {
    /**
     * 是否需要下线一个资源
     * 
     * @param totalUse 总共分配次数
     * @param failedTimes 失败次数
     * @return
     */
    public boolean needOffline(Score score);
}
