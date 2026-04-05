package com.mbridge.msdk.foundation.download.resource;

import com.mbridge.msdk.foundation.download.DownloadResourceType;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ResourceConfig {
    private long maxStorageSpace;
    private Map<String, Long> maxStorageSpacePerResourceType;
    private long maxStorageTime;
    private Map<String, Long> maxStorageTimePerResourceType;
    private Queue<ResourceStrategy> resourceStrategyQueue;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {
        private long maxStorageSpace;
        private Map<String, Long> maxStorageSpacePerResourceType;
        private long maxStorageTime;
        private Map<String, Long> maxStorageTimePerResourceType;
        private Queue<ResourceStrategy> resourceStrategyQueue;

        public Builder addMaxStorageSpace(DownloadResourceType downloadResourceType, long j10) {
            if (this.maxStorageSpacePerResourceType == null) {
                this.maxStorageSpacePerResourceType = new HashMap();
            }
            this.maxStorageSpacePerResourceType.put(downloadResourceType.name(), Long.valueOf(j10));
            return this;
        }

        public Builder addMaxStorageTime(DownloadResourceType downloadResourceType, long j10) {
            if (this.maxStorageTimePerResourceType == null) {
                this.maxStorageTimePerResourceType = new HashMap();
            }
            this.maxStorageTimePerResourceType.put(downloadResourceType.name(), Long.valueOf(j10));
            return this;
        }

        public Builder addResourceStrategy(ResourceStrategy resourceStrategy) {
            if (this.resourceStrategyQueue == null) {
                this.resourceStrategyQueue = new ArrayDeque();
            }
            this.resourceStrategyQueue.add(resourceStrategy);
            return this;
        }

        public ResourceConfig build() {
            return new ResourceConfig(this);
        }

        public Builder setMaxStorageSpace(long j10) {
            this.maxStorageSpace = j10;
            return this;
        }

        public Builder setMaxStorageTime(long j10) {
            this.maxStorageTime = j10;
            return this;
        }
    }

    public long getMaxStorageSpace() {
        return this.maxStorageSpace;
    }

    public Map<String, Long> getMaxStorageSpacePerResourceType() {
        return this.maxStorageSpacePerResourceType;
    }

    public long getMaxStorageTime() {
        return this.maxStorageTime;
    }

    public Map<String, Long> getMaxStorageTimePerResourceType() {
        return this.maxStorageTimePerResourceType;
    }

    public Queue<ResourceStrategy> getResourceStrategyQueue() {
        return this.resourceStrategyQueue;
    }

    private ResourceConfig(Builder builder) {
        this.maxStorageSpace = builder.maxStorageSpace;
        this.maxStorageTime = builder.maxStorageTime;
        this.maxStorageSpacePerResourceType = builder.maxStorageSpacePerResourceType;
        this.maxStorageTimePerResourceType = builder.maxStorageTimePerResourceType;
        this.resourceStrategyQueue = builder.resourceStrategyQueue;
    }

    public long getMaxStorageSpace(DownloadResourceType downloadResourceType) {
        Map<String, Long> map = this.maxStorageSpacePerResourceType;
        if (map == null || !map.containsKey(downloadResourceType.name())) {
            return 0L;
        }
        return this.maxStorageSpacePerResourceType.get(downloadResourceType.name()).longValue();
    }

    public long getMaxStorageTime(DownloadResourceType downloadResourceType) {
        Map<String, Long> map = this.maxStorageTimePerResourceType;
        if (map == null || !map.containsKey(downloadResourceType.name())) {
            return 0L;
        }
        return this.maxStorageTimePerResourceType.get(downloadResourceType.name()).longValue();
    }
}
