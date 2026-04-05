package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ProgressiveDownloader implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    private final Cache cache;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private final PriorityTaskManager priorityTaskManager;
    private final CacheUtil.CachingCounters cachingCounters = new CacheUtil.CachingCounters();
    private final AtomicBoolean isCanceled = new AtomicBoolean();

    public ProgressiveDownloader(Uri uri, String str, DownloaderConstructorHelper downloaderConstructorHelper) {
        this.dataSpec = new DataSpec(uri, 0L, -1L, str, 0);
        this.cache = downloaderConstructorHelper.getCache();
        this.dataSource = downloaderConstructorHelper.buildCacheDataSource(false);
        this.priorityTaskManager = downloaderConstructorHelper.getPriorityTaskManager();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.Downloader
    public void cancel() {
        this.isCanceled.set(true);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.Downloader
    public void download() throws InterruptedException, IOException {
        this.priorityTaskManager.add(-1000);
        try {
            CacheUtil.cache(this.dataSpec, this.cache, this.dataSource, new byte[131072], this.priorityTaskManager, -1000, this.cachingCounters, this.isCanceled, true);
        } finally {
            this.priorityTaskManager.remove(-1000);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.Downloader
    public float getDownloadPercentage() {
        long j10 = this.cachingCounters.contentLength;
        if (j10 == -1) {
            return -1.0f;
        }
        return (this.cachingCounters.totalCachedBytes() * 100.0f) / j10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.Downloader
    public long getDownloadedBytes() {
        return this.cachingCounters.totalCachedBytes();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.Downloader
    public void remove() {
        CacheUtil.remove(this.cache, CacheUtil.getKey(this.dataSpec));
    }
}
