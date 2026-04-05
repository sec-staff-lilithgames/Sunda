package com.mbridge.msdk.playercommon.exoplayer2.offline;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DummyDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.FileDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.PriorityDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DownloaderConstructorHelper {
    private final Cache cache;
    private final DataSource.Factory cacheReadDataSourceFactory;
    private final DataSink.Factory cacheWriteDataSinkFactory;
    private final PriorityTaskManager priorityTaskManager;
    private final DataSource.Factory upstreamDataSourceFactory;

    public DownloaderConstructorHelper(Cache cache, DataSource.Factory factory) {
        this(cache, factory, null, null, null);
    }

    public CacheDataSource buildCacheDataSource(boolean z10) {
        DataSource.Factory factory = this.cacheReadDataSourceFactory;
        DataSource dataSourceCreateDataSource = factory != null ? factory.createDataSource() : new FileDataSource();
        if (z10) {
            return new CacheDataSource(this.cache, DummyDataSource.INSTANCE, dataSourceCreateDataSource, null, 1, null);
        }
        DataSink.Factory factory2 = this.cacheWriteDataSinkFactory;
        DataSink dataSinkCreateDataSink = factory2 != null ? factory2.createDataSink() : new CacheDataSink(this.cache, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE);
        DataSource dataSourceCreateDataSource2 = this.upstreamDataSourceFactory.createDataSource();
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        return new CacheDataSource(this.cache, priorityTaskManager == null ? dataSourceCreateDataSource2 : new PriorityDataSource(dataSourceCreateDataSource2, priorityTaskManager, -1000), dataSourceCreateDataSource, dataSinkCreateDataSink, 1, null);
    }

    public Cache getCache() {
        return this.cache;
    }

    public PriorityTaskManager getPriorityTaskManager() {
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        return priorityTaskManager != null ? priorityTaskManager : new PriorityTaskManager();
    }

    public DownloaderConstructorHelper(Cache cache, DataSource.Factory factory, DataSource.Factory factory2, DataSink.Factory factory3, PriorityTaskManager priorityTaskManager) {
        Assertions.checkNotNull(factory);
        this.cache = cache;
        this.upstreamDataSourceFactory = factory;
        this.cacheReadDataSourceFactory = factory2;
        this.cacheWriteDataSinkFactory = factory3;
        this.priorityTaskManager = priorityTaskManager;
    }
}
